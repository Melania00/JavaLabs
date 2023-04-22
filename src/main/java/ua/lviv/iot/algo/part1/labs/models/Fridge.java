package ua.lviv.iot.algo.part1.labs.models;

import lombok.Getter;

@Getter
public abstract class Fridge {
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

    public abstract String getHeaders();

    public abstract String toCSV();

    public void toString(Object obj) {
        Fridge fridge = (Fridge) obj;
        System.out.printf(
                "Brand: %s %n Model: %s%n capacityInLitres: %d%n" +
                        "isDefrosting: %s%n energyEfficiencyClass: %s%n",
                fridge.brand,
                fridge.model,
                fridge.capacityInLitres,
                fridge.isDefrosting,
                fridge.energyEfficiencyClass
        );
        if (obj instanceof WineFridge winefridge) {
            System.out.printf(
                    "maxNumberOfBottles: %d %n" +
                            "maxVolumeOfBottles: %d %n",
                    winefridge.getMaxNumberOfBottles(),
                    winefridge.getMaxVolumeOfBottles()
            );
        }
        else if (obj instanceof FridgeCamera fridgecamera) {
            System.out.printf(
                    "numberOfEntries: %d %n typeOfDriveType: %s%n" +
                            "beltSpeed: %d%n maxWeightOfSausage: %d%n" +
                            "maxTapeSpeed: %d%n VOLUME_PER_KILOGRAM: %d%n",
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
