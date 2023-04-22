package ua.lviv.iot.algo.part1.labs.writers;

import ua.lviv.iot.algo.part1.labs.models.Fridge;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FridgeWriter {
    public void writeToFile(List<Fridge> fridges, String fileName) {
        String name = String.format("%s%s", "src/main/resources/", fileName);
        try (FileWriter writer = new FileWriter(name)) {
            List<Fridge> sortedFridges = fridges.stream()
                    .sorted((o1, o2) -> o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName()))
                    .toList();
            String classname = sortedFridges.get(0).getClass().getSimpleName();
            writer.append(sortedFridges.get(0).getHeaders());
            writer.append("\n");
            for (Fridge fridge : sortedFridges) {
                if (!classname.equals(fridge.getClass().getSimpleName())) {
                    classname = fridge.getClass().getSimpleName();
                    writer.append(fridge.getHeaders());
                    writer.append("\n");
                }
                writer.append(fridge.toCSV());
                writer.append("\n");
            }
        } catch (IOException e) {
            new File(String.format("%s%s", "src/main/writers/resources", fileName));
        }
    }
}
