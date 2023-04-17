package ua.lviv.iot.algo.part1.labs;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter

public class FridgeManager {
    private final List<Fridge> fridges;

    public FridgeManager() {
        fridges = new ArrayList<>();
    }

    public void addFridge(Fridge fridge) {
        fridges.add(fridge);
    }

    public static void main(String[] args) {
        FridgeManager wineFridgeManager = new FridgeManager();
        WineFridge wineFridge1 = new WineFridge("Samsung", "WF-123", 100, true,
                                                "A+++", 20, 1000);
        wineFridgeManager.addFridge(wineFridge1);

        WineFridge wineFridge2 = new WineFridge("LG", "WF-456", 200, false,
                                                "A++", 50, 700);
        wineFridgeManager.addFridge(wineFridge2);

        FridgeWriter wineFridgeWriter = new FridgeWriter();
        wineFridgeWriter.writeToFile(wineFridgeManager.getFridges(), "wine_fridges.csv");

        FridgeManager cameraFridgeManager = new FridgeManager();
        FridgeCamera cameraFridge1 = new FridgeCamera("Samsung", "FC-123", 200, true,
                                                    "A+++", 10, "Belt Drive",
                                                    5, 100, 20);
        cameraFridgeManager.addFridge(cameraFridge1);

        FridgeCamera cameraFridge2 = new FridgeCamera("LG", "FC-456", 300, false,
                                                        "A++", 15, "Chain Drive",
                                                        7, 150, 30);
        cameraFridgeManager.addFridge(cameraFridge2);

        FridgeWriter cameraFridgeWriter = new FridgeWriter();
        cameraFridgeWriter.writeToFile(cameraFridgeManager.getFridges(), "camera_fridges.csv");
    }
}
