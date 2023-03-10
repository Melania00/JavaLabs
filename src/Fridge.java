import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Fridge {
    private String brand;
    private String model;
    private int capacityInLitres;
    private boolean isDefrosting;
    private String energyEfficiencyClass;


    public void turnOnDefrosting()
    {
        isDefrosting = true;
    }
    public void turnOffDefrosting()
    {
        isDefrosting = false;
    }
    public void defrostStatus()
    {
        if(isDefrosting == true)
        {
            System. out. println("defrost is on");
        }
        else
        {
            System. out. println("defrost is off");
        }
    }

    }
