package ua.lviv.iot.algo.part1.labs;
import lombok.*;
@Getter
public class FridgeCamera extends Fridge{
    private final int numberOfEntries;
    private final String typeOfDriveType;
    private final int beltSpeed;
    private final int maxWeightOfSausage;
    private final int maxTapeSpeed;
    public int VOLUME_PER_KILOGRAM = 2;
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

    @Override
    public String getHeaders() {
        return "brand,model,capacityInLitres,isDefrosting,energyEfficiencyClass," +
                "numberOfEntries,typeOfDriveType,beltSpeed,maxWeightOfSausage,maxTapeSpeed";
    }

    @Override
    public String toCSV() {
        return getBrand() + "," + getModel() + "," + getCapacityInLitres() + "," +
                isDefrosting() + "," + getEnergyEfficiencyClass() + "," +
                numberOfEntries + "," + typeOfDriveType + "," + beltSpeed + "," +
                maxWeightOfSausage + "," + maxWeightOfSausage;
    }
}