package ua.lviv.iot.algo.part1.labs;

public class FridgeCamera extends Fridge{
    public String brand = super.brand;
    public Fridge fridge;
    public int numberOfEntries;
    public String typeOfDriveType;
    public int beltSpeed;
    public int maxWeightOfSausage;
    public int maxTapeSpeed;

    public final int VOLUME_PER_KILOGRAM = 2;
    public FridgeCamera(String brand,String model, int capacityInLitres,
                        boolean isDefrosting, String energyEfficiencyClass,
                        int numberOfEntries, String typeOfDriveType, int beltSpeed,
                        int maxWeightOfSausage, int maxTapeSpeed) {
        super(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
        this.numberOfEntries = numberOfEntries;
        this.typeOfDriveType = typeOfDriveType;
        this.beltSpeed = beltSpeed;
        this.maxWeightOfSausage = maxWeightOfSausage;
        this.maxTapeSpeed = maxTapeSpeed;

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
}