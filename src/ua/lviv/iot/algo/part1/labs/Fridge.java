package ua.lviv.iot.algo.part1.labs;
import lombok.*;
@ToString
@Getter
@Setter
abstract class Fridge {
    public String brand;
    public static String model;
    public static int capacityInLitres;
    public static boolean isDefrosting;
    public static String energyEfficiencyClass;

    public Fridge(String brand,String model, int capacityInLitres,
                  boolean isDefrosting, String energyEfficiencyClass){
        this.brand = brand;
        this.model = model;
        this.capacityInLitres = capacityInLitres;
        this.isDefrosting = isDefrosting;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public boolean turnOnDefrosting ()
    {
        isDefrosting = true;
        return true;
    }
    public boolean turnOffDefrosting ()
    {
        isDefrosting = false;
        return false;
    }
    public void deleteModelInfo ()
    {
        model = null;
    }

    public abstract int  getMaxUsableCapacity(int maxUsableCapacity);

    public String toString(Object obj) {
        Fridge fridge = (Fridge) obj;
        System.out.println(String.format(
                "Brand: %s \nModel: %s\ncapacityInLitres: %s\n" +
                        "isDefrosting: %s\nenergyEfficiencyClass: %s\n",
                fridge.brand,
                fridge.model,
                fridge.capacityInLitres,
                fridge.isDefrosting,
                fridge.energyEfficiencyClass
        ));
        if (obj instanceof WineFridge) {
            WineFridge winefridge = (WineFridge) obj;
            System.out.println(String.format(
                    "maxNumberOfBottles: %s \n" +
                            "maxVolumeOfBottles: %s \n",
                    winefridge.maxNumberOfBottles,
                    winefridge.maxVolumeOfBottles
            ));
        }
        else if (obj instanceof FridgeCamera) {
            FridgeCamera fridgecamera = (FridgeCamera) obj;
            System.out.println(String.format(
                    "numberOfEntries: %s \n typeOfDriveType: %s\n" +
                            "beltSpeed: %s\n maxWeightOfSausage: %s\n" +
                            "maxTapeSpeed: %s\n VOLUME_PER_KILOGRAM: %s\n",
                    fridgecamera.numberOfEntries,
                    fridgecamera.typeOfDriveType,
                    fridgecamera.beltSpeed,
                    fridgecamera.maxWeightOfSausage,
                    fridgecamera.maxTapeSpeed,
                    fridgecamera.VOLUME_PER_KILOGRAM
            ));
        }
        return null;
    }

}