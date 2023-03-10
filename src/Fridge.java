import lombok.*;
@ToString
@Setter
@Getter

public class Fridge{
    private static String brand;
    private static String model;
    private static int capacityInLitres;
    private static boolean isDefrosting;
    private static char energyEfficiencyClass;

    public Fridge(String brand, String model, int capacityInLitres, boolean isDefrosting, char energyEfficiencyClass) {
        this.brand = brand;
        this.model = model;
        this.capacityInLitres = capacityInLitres;
        this.isDefrosting = isDefrosting;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCapacityInLitres() {
        return capacityInLitres;
    }

    public boolean isDefrosting() {
        return isDefrosting;
    }

    public char getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public static Fridge instance;

    public Fridge getInstance() {
        if (instance == null) {
            return new Fridge(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
        }

    public boolean turnOnDefrosting()
    {
        isDefrosting == true;
    }
    public boolean turnOffDefrosting()
    {
        isDefrosting == false;
    }
    public void deleteModelInfo()
    {
        model == null;
    }
}
