package ua.lviv.iot.algo.part1.labs;

import lombok.Getter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.labs.models.Fridge;
import ua.lviv.iot.algo.part1.labs.writers.FridgeWriter;
import ua.lviv.iot.algo.part1.labs.models.FridgeCamera;
import ua.lviv.iot.algo.part1.labs.models.WineFridge;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class FridgeManager {
    public List<Fridge> fridges = new ArrayList<>();

    public void addFridge(Fridge fridge) {
        fridges.add(fridge);
    }

    public static void main(String[] args) {
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

        FridgeWriter fridgeWriter = new FridgeWriter();
        fridgeWriter.writeToFile(fridges, "fridges.csv");
    }
}
