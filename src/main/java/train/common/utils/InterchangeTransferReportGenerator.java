package train.common.utils;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraftforge.fluids.FluidTank;
import train.common.api.*;
import train.common.core.handlers.TrainHandler;
import train.common.library.EnumTrainType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class InterchangeTransferReportGenerator
{
    public InterchangeTransferReportGenerator()
    {

    }

    public String GenerateInterchangeTransferReport(String railroad, TrainHandler trainHandler, Boolean alternativeOrder)
    {
        List<String> theReport = new ArrayList<>();

        String timezoneCode = Calendar.getInstance().getTimeZone().getDisplayName(false, TimeZone.SHORT);

        while (railroad.length() < (45 - timezoneCode.length()))
        {
            railroad += " ";
        }

        theReport.add(railroad + " " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + " " + timezoneCode + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("SEQ    CAR        L/T  DEST    CSTMR       CMD" + "\n");
        theReport.add("---------------------------------------------------------" + "\n");

        ArrayList<EntityRollingStock> rollingStockArrayList = trainHandler.getTrains();

        EntityRollingStock leadCar = null;

        for (EntityRollingStock car : rollingStockArrayList)
        {
            if (leadCar == null && (car.cartLinked1 == null || car.cartLinked2 == null))
            {
                leadCar = car;
            }
            else if (car instanceof Locomotive && ((Locomotive) car).canBePulled == false && (car.cartLinked1 == null || car.cartLinked2 == null))
            {
                leadCar = car;
                break;
            }
        }

        List<EntityRollingStock> sortedList = getCarsInOrder(leadCar);

        if (alternativeOrder)
        {
            Collections.reverse(sortedList);
        }

        Map<Integer, EntityRollingStock> carsWithBrakeOn = new HashMap<>();

        int locomotiveCount = 0;
        int emptyRollingStockCount = 0;
        int loadedRollingStockCount = 0;
        for (int i = 0; i < sortedList.size(); i++)
        {
            EntityRollingStock temp = sortedList.get(i);
            String carNameToUse = temp.getTrainNote();
            if (carNameToUse == null || carNameToUse.length() == 0)
            {
                carNameToUse = temp.getTrainName();
            }

            if (carNameToUse.length() < 13)
            {
                while (carNameToUse.length() < 13)
                {
                    carNameToUse += " ";
                }
            }else if (carNameToUse.length() > 12)
            {
                for (int charterCount = (carNameToUse.length() - 1); charterCount > 12; charterCount--)
                {
                    carNameToUse = carNameToUse.substring(0, charterCount);
                }
            }


            String inventoryStatus = carInventoryStatus(temp);


            if (temp instanceof Locomotive)
            {
                locomotiveCount++;
            }
            else
            {
                if (inventoryStatus != "**EMPTY**")
                {
                    loadedRollingStockCount++;
                }
                else
                {
                    emptyRollingStockCount++;
                }
            }

            if (temp.getParkingBrakeDW())
            {
                carsWithBrakeOn.put(i + 1, temp);
            }

            String inventoryStatusFormatted = inventoryStatus;

            if (inventoryStatusFormatted.length() > 14)
            {
                for (int charterCount = (inventoryStatusFormatted.length() - 1); charterCount > 14; charterCount--)
                {
                    inventoryStatusFormatted = inventoryStatusFormatted.substring(0, charterCount);
                }
            }

            theReport.add((i + 1 + ((i + 1) > 9 ? "  " : "   ") + carNameToUse + " ") + isCarLoaded(temp, inventoryStatus) + "/" + EnumTrainType.GetTrainTypeCode(temp.trainType) + "  " + "????" + "   " + "{??????}" + "     " + inventoryStatusFormatted + "\n");


        }
        theReport.add("=========================================================" + "\n");
        String carStats = "CARS- ## LOADS- $$ EMPTIES- !! LOCOS- XX LENGTH- ??m      ";
        int carTotal = (loadedRollingStockCount +  emptyRollingStockCount + locomotiveCount);
        carStats = carStats.replace("##", carTotal + " ");
        carStats = carStats.replace("$$", loadedRollingStockCount + " ");
        carStats = carStats.replace("!!", emptyRollingStockCount + " " );
        carStats = carStats.replace("XX", locomotiveCount + " ");


        if (carStats.length() > 52)
        {
            carStats = carStats.replace("  ", " ");
        }


        theReport.add(carStats + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("LOCATION:                                                " + "\n");
        theReport.add("=========================================================" + "\n");
        theReport.add("Cars with brake engaged" + "\n");
        if (carsWithBrakeOn.size() == 0)
        {
            theReport.add("N/A" + "\n");
        }
        else
        {
            for (Map.Entry<Integer, EntityRollingStock> entry : carsWithBrakeOn.entrySet())
            {
                int key = entry.getKey();
                EntityRollingStock value = entry.getValue();

                String carNameToUse = value.getTrainNote();
                if (carNameToUse == null || carNameToUse.length() == 0)
                {
                    carNameToUse = value.getTrainName();
                }

                theReport.add(key + " " + carNameToUse + "\n");
            }
        }

        theReport.add("=========================================================" + "\n");
        theReport.add("**END OF REPORT**" + "\n");
        StringBuffer reportAsFullString = new StringBuffer();

        for (int i = 0; i < theReport.size(); i++)
        {
            reportAsFullString.append(theReport.get(i));
        }

        return reportAsFullString.toString();
    }

    private String isCarLoaded(EntityRollingStock stock, String inventoryStatusMessage)
    {
        if (inventoryStatusMessage != "**EMPTY**")
        {
            return "L";
        }

        return "E";
    }

    private String carInventoryStatus(EntityRollingStock entityRollingStock)
    {
        if (entityRollingStock instanceof Locomotive)
        {
            return "Locomotive";
        }

        if (entityRollingStock instanceof AbstractWorkCart)
        {
            return "Caboose/WorkCart";
        }

        if (entityRollingStock instanceof AbstractControlCar)
        {
            return "ControlCar";
        }

        if (entityRollingStock instanceof AbstractPassengerCar)
        {
            return "Passenger Car";
        }

        if (entityRollingStock instanceof LiquidTank)
        {
            FluidTank fluidTank = ((LiquidTank)entityRollingStock).getTank();

           if (fluidTank.getFluidAmount() > 0)
           {
               return fluidTank.getFluid().getLocalizedName();
           }
           else
           {
               return "**EMPTY**";
           }
        }

        if (entityRollingStock.getInventory() == null || entityRollingStock.getInventory().length == 0)
        {
            return "**N/A**";
        }

        for (ItemStack itemStack : entityRollingStock.getInventory())
        {
            if (itemStack != null)
            {
                return "SOMETHING";
            }
        }

        return "**EMPTY**";
    }


    private List<EntityRollingStock> getCarsInOrder(EntityRollingStock start) {
        if (start.cartLinked1 == null) return Collections.emptyList();
        TreeMap<Integer, EntityRollingStock> cars = new TreeMap<>();
        cars.put(0, start);
        if (start.trainHandler != null && !(start.cartLinked1).trainHandler.getTrains().isEmpty() && (start.cartLinked1).trainHandler.getTrains().size() > 1)
        {
            for (int i = 0; i < (start.cartLinked1).trainHandler.getTrains().size(); i++)
            {
                EntityRollingStock stock = (start.cartLinked1).trainHandler.getTrains().get(i);
                if (stock != start)
                {
                    cars.put((int) Vec3.createVectorHelper(start.posX, start.posY, start.posZ).distanceTo(Vec3.createVectorHelper(stock.posX, stock.posY, stock.posZ)), stock);
                }

            }
        }

        return new ArrayList<>(cars.values());
    }

    @SideOnly(Side.CLIENT)
    public void createRawConsistReport(String theReport)
    {
        FileWriter myWriter = null;
        try {
            Format f = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
            String strDate = f.format(new Date());
            //File myObj = new File(Loader.instance().getConfigDir() + File.separator + "traincraft" + File.separator + "Interchange" + "-" + strDate + ".txt");
            File directory = new File(Loader.instance().getConfigDir() + "../" + "../" + File.separator + "InterchangeReports");
            if (directory.exists() == false)
            {
                directory.mkdir();
            }
            File myObj = new File(Loader.instance().getConfigDir() + "../" + "../" + File.separator + "InterchangeReports" + File.separator + "Interchange" + "-" + strDate + ".txt");
            myObj.createNewFile();
            myWriter = new FileWriter(myObj);
            myWriter.write(theReport);
            myWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
