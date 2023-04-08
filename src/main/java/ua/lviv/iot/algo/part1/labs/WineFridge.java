package ua.lviv.iot.algo.part1.labs;

public class WineFridge extends Fridge{
    public int maxNumberOfBottles;
    public double maxVolumeOfBottles;
    public WineFridge(String brand,String model, int capacityInLitres,
                      boolean isDefrosting, String energyEfficiencyClass,
                      int maxNumberOfBottles, int maxVolumeOfBottles){
        super(brand,model,capacityInLitres,isDefrosting,energyEfficiencyClass);
        this.maxNumberOfBottles = maxNumberOfBottles;
        this.maxVolumeOfBottles = maxVolumeOfBottles;
    }
    @Override
    public int getMaxUsableCapacity(int maxUsableCapacity) {
        return 0;
    }
}