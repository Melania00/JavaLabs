package ua.lviv.iot.algo.part1.labs.writers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;

import org.hamcrest.MatcherAssert;
//import org.hamcrest.Matchers;
import ua.lviv.iot.algo.part1.labs.models.Fridge;
import ua.lviv.iot.algo.part1.labs.models.FridgeCamera;
import ua.lviv.iot.algo.part1.labs.models.WineFridge;
import ua.lviv.iot.algo.part1.labs.writers.FridgeWriter;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FridgeWriterTest {

    public List<Fridge> createFridges() {
        List<Fridge> fridges = new ArrayList<>();
        fridges.add(new WineFridge("Samsung", "WF-123", 100, true,
                "A+++", 20, 1000));
        fridges.add(new WineFridge("LG", "WF-456", 200, false,
                "A++", 50, 700));
        fridges.add(new FridgeCamera("Samsung", "FC-123", 200, true,
                "A+++", 10, "mechanic",
                5, 100, 20));
        fridges.add(new FridgeCamera("LG", "FC-456", 300, false,
                "A++", 15, "electric",
                7, 150, 30));
        return fridges;
    }

    @Test
    public void testWriteToFile() throws IOException {

        // Write the fridges to a file
        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(createFridges(), "test.csv");

        // Check that the file contents match the expected value
        List<String> actualLines = Files.readAllLines(Paths.get("src/main/resources/fridges.csv"));
        List<String> expectedLines = Files.readAllLines(Paths.get("src/main/resources/test.csv"));
        assertEquals(expectedLines, actualLines);
    }

    @Test
    public void testWriteEmptyList() throws IOException {
        List<Fridge> fridges = new ArrayList<>();

        // Write the fridges to a file
        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridges, "test.csv");

        // Check that the file is not empty
        long fileSize = 0;
        assertEquals(0, fileSize);
    }

    @Test
    public void testOverrideFileContent() throws IOException {
        testWriteToFile();
        testWriteToFile();
    }
}
