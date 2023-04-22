package ua.lviv.iot.algo.part1.labs.models;

import lombok.Getter;

@Getter
public abstract class Fridge {
    private final String brand;
    private final String model;
    private final int capacityInLitres;
    private final boolean isDefrosting;
    private final String energyEfficiencyClass;

    public Fridge(String brand, String model, int capacityInLitres,
                  boolean isDefrosting, String energyEfficiencyClass) {
        this.brand = brand;
        this.model = model;
        this.capacityInLitres = capacityInLitres;
        this.isDefrosting = isDefrosting;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public abstract boolean turnOnDefrosting(boolean isDefrosting);

    public abstract boolean turnOffDefrosting(boolean isDefrosting);

    public abstract String deleteModelInfo(String model);

    public abstract int getMaxUsableCapacity(int maxUsableCapacity);

    public abstract String getHeaders();
    public abstract String toCSV();
}
