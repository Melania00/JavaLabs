import lombok.*;

import java.util.Arrays;

@ToString
@Setter
@Getter

public class Fridge {
    private static String brand;
    private static String model;
    private static int capacityInLitres;
    private static boolean isDefrosting;
    private static String energyEfficiencyClass;

    public Fridge(String brand, String model, int capacityInLitres, boolean isDefrosting, String energyEfficiencyClass) {
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

    public String getEnergyEfficiencyClass() {
        return energyEfficiencyClass;
    }

    public static Fridge instance;

    public static Fridge getInstance() {
        if (instance == null) {
            return new Fridge(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
        }
    return new Fridge(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
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

    public static void main(String[]args)
    {
        Fridge[] fridge = new Fridge[4];
        fridge[0] = new Fridge(brand, model, capacityInLitres, isDefrosting, energyEfficiencyClass);
        fridge[1] = new Fridge("Samsung", "A-57", 20, true, "A");
        fridge[2] = Fridge.getInstance();
        fridge[3] = Fridge.getInstance();

        Arrays.stream(fridge).map(i -> fridge[4].toString()).forEach(System.out::println);
    }
}