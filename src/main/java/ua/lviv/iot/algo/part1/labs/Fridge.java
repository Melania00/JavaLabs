package ua.lviv.iot.algo.part1.labs;
import lombok.*;
@Getter
abstract class Fridge {
    private final String brand;
    private final String model;
    private final int capacityInLitres;
    private final boolean isDefrosting;
    private final String energyEfficiencyClass;

    public Fridge(String brand,String model, int capacityInLitres,
                  boolean isDefrosting, String energyEfficiencyClass){
        this.brand = brand;
        this.model = model;
        this.capacityInLitres = capacityInLitres;
        this.isDefrosting = isDefrosting;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public abstract boolean turnOnDefrosting (boolean isDefrosting);
    public abstract boolean turnOffDefrosting (boolean isDefrosting);
    public abstract String deleteModelInfo (String model);
    public abstract int  getMaxUsableCapacity(int maxUsableCapacity);

    public void toString(Object obj) {
        Fridge fridge = (Fridge) obj;
        System.out.printf("Brand: %s \nModel: %s\ncapacityInLitres: %s\n" +
                        "isDefrosting: %s\nenergyEfficiencyClass: %s\n%n",
                fridge.brand,
                fridge.model,
                fridge.capacityInLitres,
                fridge.isDefrosting,
                fridge.energyEfficiencyClass
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
