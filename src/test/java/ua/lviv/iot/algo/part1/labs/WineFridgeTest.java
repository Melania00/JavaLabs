package ua.lviv.iot.algo.part1.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineFridgeTest {
    @Test
    void testMaxNumberOfBottles(){
        WineFridge wineFridge = new WineFridge("Apple", "efsg", 1, true,
                "D", 40, 2);
        assertEquals(40, wineFridge.getMaxNumberOfBottles());
    }

    @Test
    void testMaxVolumeOfBottles(){
        WineFridge wineFridge = new WineFridge("Nexus", "segzg", 1, false,
                "A", 35, 1);
        assertEquals(1, wineFridge.getMaxVolumeOfBottles());
    }

    @Test
    void testBrand(){
        WineFridge wineFridge = new WineFridge("Samsung", "sgrghgj", 3, false,
                "B", 27, 5);
        assertEquals("Samsung", wineFridge.getBrand());
    }

    @Test
    void testModel(){
        WineFridge wineFridge = new WineFridge("Apple", "dfe4", 2, true,
                "C", 25, 2);
        assertEquals("dfe4", wineFridge.getModel());
    }

    @Test
    void testCapacityInLitres(){
        WineFridge wineFridge = new WineFridge("Nexus", "t5ytr", 1, true,
                "A", 20, 10);
        assertEquals(1, wineFridge.getCapacityInLitres());
    }

    @Test
    void testEnergyEfficiencyClass(){
        WineFridge wineFridge = new WineFridge("Samsung", "sgergr", 3, false,
                "B", 16, 5);
        assertEquals("B", wineFridge.getEnergyEfficiencyClass());
    }
}