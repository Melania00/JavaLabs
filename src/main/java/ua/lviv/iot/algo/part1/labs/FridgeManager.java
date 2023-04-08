package ua.lviv.iot.algo.part1.labs;

import java.util.ArrayList;
import java.util.List;

public class FridgeManager {
    private static List<FridgeCamera> fridgesCameraList;
    private static final int[] fridgeCameraCapacity = {3, 5, 1};
    private static final String[] brand = {"Nexus", "Samsung", "Apple"};
    private static final int[] volumePerKilogram = {2, 4, 5};
    private static ArrayList<WineFridge> wineFridges;
    private static final int[] fridgeWineCapacity = {1, 2, 3};

    public void toString(Object obj) {
        Fridge fridge = (Fridge) obj;
        System.out.printf("Brand: %s \nModel: %s\ncapacityInLitres: %s\n" +
                        "isDefrosting: %s\nenergyEfficiencyClass: %s\n%n",
                fridge.getBrand(),
                fridge.getModel(),
                fridge.getCapacityInLitres(),
                fridge.isDefrosting(),
                fridge.getEnergyEfficiencyClass()
        );
        if (obj instanceof WineFridge) {
            WineFridge winefridge = (WineFridge) obj;
            System.out.printf("maxNumberOfBottles: %s \n" +
                            "maxVolumeOfBottles: %s \n%n",
                    winefridge.getMaxNumberOfBottles(),
                    winefridge.getMaxVolumeOfBottles()
            );
        }
        else if (obj instanceof FridgeCamera) {
            FridgeCamera fridgecamera = (FridgeCamera) obj;
            System.out.printf("numberOfEntries: %s \n typeOfDriveType: %s\n" +
                            "beltSpeed: %s\n maxWeightOfSausage: %s\n" +
                            "maxTapeSpeed: %s\n VOLUME_PER_KILOGRAM: %s\n%n",
                    fridgecamera.getNumberOfEntries(),
                    fridgecamera.getTypeOfDriveType(),
                    fridgecamera.getBeltSpeed(),
                    fridgecamera.getMaxWeightOfSausage(),
                    fridgecamera.getMaxTapeSpeed(),
                    fridgecamera.VOLUME_PER_KILOGRAM
            );
        }
    }
}