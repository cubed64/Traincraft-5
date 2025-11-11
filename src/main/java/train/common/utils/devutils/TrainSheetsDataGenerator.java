package train.common.utils.devutils;

import cpw.mods.fml.common.Loader;
import net.minecraft.item.Item;
import train.common.Traincraft;
import train.common.library.register.ITrainRecord;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSheetsDataGenerator
{
    public TrainSheetsDataGenerator()
    {
        StringBuilder tsv = new StringBuilder();
        Map<Item, ITrainRecord> list = Traincraft.traincraftRegistry.getAllTrains();

        // Header row (recommended)
        tsv.append("ItemName\tInternalName\tEntityClass\tTexturePrefix\n");

        for (Map.Entry<Item, ITrainRecord> entry : list.entrySet()) {

            Item item = entry.getKey();
            ITrainRecord record = entry.getValue();

            String name = item.getUnlocalizedName();
            String internalName = record.getInternalName();
            String className = record.getEntityClass().getName();
            String texturePrefix = Traincraft.traincraftRegistry
                    .getTrainRenderRecord(record.getEntityClass())
                    .getTexturePrefix();

            tsv.append(name).append("\t")
                    .append(internalName).append("\t")
                    .append(className).append("\t")
                    .append(texturePrefix).append("\n");
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
