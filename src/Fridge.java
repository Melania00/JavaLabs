import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Fridge{
    private String brand;
    private String model;
    private int capacityInLitres;
    private boolean isDefrosting;
    private String energyEfficiencyClass;

    public static Fridge instance;

    public static Fridge getInstance() {
        if (instance == null) {
            return new Fridge();
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
