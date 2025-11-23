package train.common.utils.devutils;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.library.register.ITrainRecord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class TrainSheetsDataGenerator
{
    public TrainSheetsDataGenerator()
    {
        StringBuilder tsv = new StringBuilder();
        List<Map.Entry<Item, ITrainRecord>> list = new ArrayList<Map.Entry<Item, ITrainRecord>>(Traincraft.traincraftRegistry.getAllTrains().entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Item, ITrainRecord>>()
        {
            @Override
            public int compare(Map.Entry<Item, ITrainRecord> e1,
                               Map.Entry<Item, ITrainRecord> e2)
            {

                // Compare by entity class name
                String c1 = e1.getValue().getEntityClass().getSimpleName();
                String c2 = e2.getValue().getEntityClass().getSimpleName();

                int cmp = c1.compareTo(c2);
                if (cmp != 0) return cmp;

                // Tie-breaker by item name (required for stability)
                return e1.getKey().getUnlocalizedName()
                        .compareTo(e2.getKey().getUnlocalizedName());
            }
        });

        // Header row (recommended)
        tsv.append("ItemName\tInternalName\tEntityClass\tTexturePrefix\n");



        try
        {
            for (Map.Entry<Item, ITrainRecord> entry : list)
            {

                Item item = entry.getKey();
                ITrainRecord record = entry.getValue();
                String name = item.getUnlocalizedName();
                String internalName = record.getInternalName();
                String className = record.getEntityClass().getName();
                World world = null;
                String texturePrefix = Traincraft.traincraftRegistry
                        .getTrainRenderRecord(record.getEntityClass(), (AbstractTrains) record.getEntityClass().getConstructor(World.class).newInstance(world))
                        .getTexturePrefix();

                tsv.append(name).append("\t")
                        .append(internalName).append("\t")
                        .append(className).append("\t")
                        .append(texturePrefix).append("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        try {
            File configDir = Loader.instance().getConfigDir();
            File outDir = new File(configDir, "../../devdata");

            if (!outDir.exists()) outDir.mkdirs();

            File outFile = new File(outDir, "Trains-PrefixData" + ".tsv");

            try (FileWriter writer = new FileWriter(outFile)) {
                writer.write(tsv.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
