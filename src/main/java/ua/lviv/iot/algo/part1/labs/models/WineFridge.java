package ua.lviv.iot.algo.part1.labs.models;

import lombok.Getter;

@Getter
public class WineFridge extends Fridge {
    private final int maxNumberOfBottles;
    private final int maxVolumeOfBottles;

    public WineFridge(String brand, String model, int capacityInLitres,
                      boolean isDefrosting, String energyEfficiencyClass,
                      int maxNumberOfBottles, int maxVolumeOfBottles) {
        super(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
        this.maxNumberOfBottles = maxNumberOfBottles;
        this.maxVolumeOfBottles = maxVolumeOfBottles;
    }

    @Override
    public boolean turnOnDefrosting(boolean isDefrosting) {
        return true;
    }

    @Override
    public boolean turnOffDefrosting(boolean isDefrosting) {
        return false;
    }

    @Override
    public String deleteModelInfo(String model) {
        return null;
    }

    @Override
    public int getMaxUsableCapacity(int capacityInLitres) {
        return capacityInLitres * 10;
    }

    @Override
    public String getHeaders() {
        return "brand,model,capacityInLitres,isDefrosting,energyEfficiencyClass," +
                "maxNumberOfBottles,maxVolumeOfBottles";
    }

    @Override
    public String toCSV() {
        return getBrand() + "," + getModel() + "," + getCapacityInLitres() + "," +
                isDefrosting() + "," + getEnergyEfficiencyClass() + "," +
                maxNumberOfBottles + "," + maxVolumeOfBottles;
    }
}