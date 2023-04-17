package ua.lviv.iot.algo.part1.labs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FridgeWriter {
    public void writeToFile(List<Fridge> fridges, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(fridges.get(0).getHeaders() + "\n");

            for (Fridge fridge : fridges) {
                writer.write(fridge.toCSV() + "\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
