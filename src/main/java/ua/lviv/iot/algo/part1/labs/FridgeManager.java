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

    public void removeFridge(Fridge fridge) {
        fridges.remove(fridge);
    }
    public List<Fridge> getFridges() {
        return fridges;
    }

    public static void main(String[] args) {
        FridgeManager fridgeManager = new FridgeManager();
        FridgeCamera fridgeCamera1 = new FridgeCamera("Samsung", "FC-123", 200, true,
                                                "A+++", 10, "Belt Drive",
                                                5, 100, 20);
        fridgeManager.addFridge(fridgeCamera1);

        WineFridge wineFridge1 = new WineFridge("LG", "WF-456", 300, false,
                                            "A++", 50, 700);
        fridgeManager.addFridge(wineFridge1);

        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridgeManager.getFridges(), "fridges.csv");
    }
}
