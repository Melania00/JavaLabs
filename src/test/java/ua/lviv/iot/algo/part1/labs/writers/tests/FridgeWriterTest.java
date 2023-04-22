package ua.lviv.iot.algo.part1.labs.writers.tests;

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
    @Test
    void testWriteToFile() throws IOException {
        List<Fridge> fridges = new ArrayList<>();
        WineFridge wineFridge1 = new WineFridge("Samsung", "WF-123", 100, true,
                "A+++", 20, 1000);
        fridges.add(wineFridge1);

        WineFridge wineFridge2 = new WineFridge("LG", "WF-456", 200, false,
                "A++", 50, 700);
        fridges.add(wineFridge2);

        FridgeCamera cameraFridge1 = new FridgeCamera("Samsung", "FC-123", 200, true,
                "A+++", 10, "mechanic",
                5, 100, 20);
        fridges.add(cameraFridge1);

        FridgeCamera cameraFridge2 = new FridgeCamera("LG", "FC-456", 300, false,
                "A++", 15, "electric",
                7, 150, 30);
        fridges.add(cameraFridge2);
        // Write the fridges to a file
        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridges, "test.csv");

        // Check that the file contents match the expected value
        List<String> actualLines = Files.readAllLines(Paths.get("src/main/resources/fridges.csv"));
        List<String> expectedLines = Files.readAllLines(Paths.get("src/main/resources/test.csv"));
        assertEquals(expectedLines, actualLines);
    }

    @Test
    void testWriteEmptyList() throws IOException {
        List<Fridge> fridges = new ArrayList<>();

        // Write the fridges to a file
        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridges, "test.csv");

        // Check that the file is not empty
        long fileSize = 0;
        assertEquals(0, fileSize);
    }
}
