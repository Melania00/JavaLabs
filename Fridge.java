import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Fridge {
    public String brand;
    public String model;
    public int capacityInLitres;
    public boolean isDefrosting;
    public String energyEfficiencyClass;

    public static Fridge instance = new Fridge();
    public static Fridge getInstance() {
        return instance;
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
        fridge[0] = new Fridge();
        fridge[1] = new Fridge("Samsung", "A-57", 20, true, "A");
        fridge[2] = Fridge.getInstance();
        fridge[3] = Fridge.getInstance();

        for (var fridges: fridge)
        {
            System.out.println(fridges);
        }
    }
}