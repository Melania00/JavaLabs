package ua.lviv.iot.algo.part1.labs;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.labs.models.WineFridge;

import static org.junit.jupiter.api.Assertions.*;

class WineFridgeTest {
    @Test
    void testMaxNumberOfBottles(){
        WineFridge wineFridge = new WineFridge("Apple", "WF-789", 1, true,
                "D", 40, 2);
        assertEquals(40, wineFridge.getMaxNumberOfBottles());
    }

    @Test
    void testMaxVolumeOfBottles(){
        WineFridge wineFridge = new WineFridge("Nexus", "WF-754", 1, false,
                "A", 35, 1);
        assertEquals(1, wineFridge.getMaxVolumeOfBottles());
    }

    @Test
    void testBrand(){
        WineFridge wineFridge = new WineFridge("Samsung", "WF-234", 3, false,
                "B", 27, 5);
        assertEquals("Samsung", wineFridge.getBrand());
    }

    @Test
    void testModel(){
        WineFridge wineFridge = new WineFridge("Apple", "WF-709", 2, true,
                "C", 25, 2);
        assertEquals("dfe4", wineFridge.getModel());
    }

    @Test
    void testCapacityInLitres(){
        WineFridge wineFridge = new WineFridge("Nexus", "WF-473", 1, true,
                "A", 20, 10);
        assertEquals(1, wineFridge.getCapacityInLitres());
    }

    @Test
    void testEnergyEfficiencyClass(){
        WineFridge wineFridge = new WineFridge("Samsung", "WF-385", 3, false,
                "B", 16, 5);
        assertEquals("B", wineFridge.getEnergyEfficiencyClass());
    }
    @Test
    void testGetHeaders() {
        WineFridge wineFridge = new WineFridge("Samsung", "WF-123", 100, true,
                "A+++", 20, 2);

        String expectedHeaders = "brand,model,capacityInLitres,isDefrosting,energyEfficiencyClass," +
                                "maxNumberOfBottles,maxVolumeOfBottles";
        String actualHeaders = wineFridge.getHeaders();

        assertEquals(expectedHeaders, actualHeaders);
    }
    @Test
    void testToCSV() {
        WineFridge wineFridge = new WineFridge("Nexus", "WF-473", 1, true,
                "A", 20, 10);

        String expectedCSV = "Nexus,WF-473,1,true,A,20,10";
        String actualCSV = wineFridge.toCSV();

        assertEquals(expectedCSV, actualCSV);
    }
}