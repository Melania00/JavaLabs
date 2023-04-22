package ua.lviv.iot.algo.part1.labs.writers;

import ua.lviv.iot.algo.part1.labs.models.Fridge;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class FridgeWriter {
    public void writeToFile(List<Fridge> fridges, String fileName) {
        String name = String.format("%s%s", "src/main/resources/", fileName);
        try (FileWriter writer = new FileWriter(name)) {
            fridges.sort(Comparator.comparing(fridge -> fridge.getClass().getSimpleName()));

            String writtenFridgesName = null;
            for (Fridge fridge : fridges) {

                if (!fridge.getClass().getSimpleName().equals(writtenFridgesName)) {
                    writtenFridgesName = fridge.getClass().getSimpleName();
                    writer.append(fridge.getHeaders());
                    writer.append("\n");
                }
                writer.append(fridge.toCSV());
                writer.append("\n");
            }
        } catch (IOException e) {
        }
    }
}
