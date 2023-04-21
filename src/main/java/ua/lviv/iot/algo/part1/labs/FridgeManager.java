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
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge wineFridge1 = new WineFridge("Samsung", "WF-123", 100, true,
                "A+++", 20, 1000);
        fridgeManager.addFridge(wineFridge1);

        WineFridge wineFridge2 = new WineFridge("LG", "WF-456", 200, false,
                "A++", 50, 700);
        fridgeManager.addFridge(wineFridge2);

        FridgeCamera cameraFridge1 = new FridgeCamera("Samsung", "FC-123", 200, true,
                "A+++", 10, "mechanic",
                5, 100, 20);
        fridgeManager.addFridge(cameraFridge1);

        FridgeCamera cameraFridge2 = new FridgeCamera("LG", "FC-456", 300, false,
                "A++", 15, "electric",
                7, 150, 30);
        fridgeManager.addFridge(cameraFridge2);

        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridgeManager.getFridges(), "fridges.csv");
    }
}
