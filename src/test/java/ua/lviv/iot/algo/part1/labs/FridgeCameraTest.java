package ua.lviv.iot.algo.part1.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeCameraTest {
    @Test
    void testTurnOnDefrosting(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "fysgjxs", 2, true,
                    "A", 1, "mechanic", 30, 5,
                     8);
        assertTrue(fridgeCamera.turnOnDefrosting(true));
    }

    @Test
    void testTurnOffDefrosting(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "ydhjjc", 2, false,
                "A", 1, "mechanic", 30, 5,
                11);
        assertFalse(fridgeCamera.turnOffDefrosting(false));
    }

    @Test
    void testDeleteModelInfo(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "dhvuhld", 2, true,
                "A", 1, "mechanic", 30, 8,
                8);
        assertNull(fridgeCamera.deleteModelInfo("dhvuhld"));
    }

    @Test
    void testGetMaxUsableCapacity(){
        FridgeCamera fridgeCamera = new FridgeCamera("Apple", "rhbfdg", 2, true,
                "A", 1, "mechanic", 30, 6,
                5);
        assertEquals(20, fridgeCamera.getMaxUsableCapacity(2));
    }

    @Test
    void testNumberOfEntries(){
        FridgeCamera fridgeCamera = new FridgeCamera("Samsung", "ymbjkc", 2, false,
                "B", 1, "mechanic", 10, 4,
                6);
        assertEquals(1, fridgeCamera.getNumberOfEntries());
    }

    @Test
    void testTypeOfDriveType(){
        FridgeCamera fridgeCamera = new FridgeCamera("Samsung", "dgdrh", 3, true,
                "C", 2, "mechanic", 40, 13,
                8);
        assertEquals("mechanic", fridgeCamera.getTypeOfDriveType());
    }

    @Test
    void testBeltSpeed(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "dfszg", 1, false,
                "A", 3, "mechanic", 15, 9,
                10);
        assertEquals(15, fridgeCamera.getBeltSpeed());
    }

    @Test
    void testMaxWeightOfSausage(){
        FridgeCamera fridgeCamera = new FridgeCamera("Apple", "sghth", 2, true,
                "A", 1, "mechanic", 18, 5,
                5);
        assertEquals(5, fridgeCamera.getMaxWeightOfSausage());
    }

    @Test
    void testMaxTapeSpeed(){
        FridgeCamera fridgeCamera = new FridgeCamera("Samsung", "sgth", 3, false,
                "B", 1, "mechanic", 10, 4,
                6);
        assertEquals(6, fridgeCamera.getMaxTapeSpeed());
    }
}