package ua.lviv.iot.algo.part1.labs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FridgeWriter {
    public void writeToFile(List<Fridge> fridges, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);

            // Write headers for WineFridges
            writer.append("Brand,Model,CapacityInLitres,isDefrosting,EnergyEfficiencyClass,maxNumberOfBottles,maxVolumeOfBottles\n");
            for (Fridge fridge : fridges) {
                if (fridge instanceof WineFridge) {
                    writer.append(fridge.toCSV());
                    writer.append("\n");
                }
            }

            // Write headers for FridgeCameras
            writer.append("\nBrand,Model,CapacityInLitres,isDefrosting,EnergyEfficiencyClass,numberOfEntries,typeOfDriveType," +
                    "beltSpeed,maxWeightOfSausage,maxWeightOfSausage\n");
            for (Fridge fridge : fridges) {
                if (fridge instanceof FridgeCamera) {
                    writer.append(fridge.toCSV());
                    writer.append("\n");
                }
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
