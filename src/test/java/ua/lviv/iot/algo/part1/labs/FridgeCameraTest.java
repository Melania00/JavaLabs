package ua.lviv.iot.algo.part1.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeCameraTest {
    @Test
    void testTurnOnDefrosting(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "fysgjxs", 2, true,
                    "A", 1, "mechanic", 30, 5,
                     8);
        assertEquals(true, fridgeCamera.turnOnDefrosting(true));
    }

    @Test
    void testTurnOffDefrosting(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "ydhjjc", 2, false,
                "A", 1, "mechanic", 30, 5,
                8);
        assertEquals(false, fridgeCamera.turnOffDefrosting(false));
    }

    @Test
    void testDeleteModelInfo(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "dhvuhld", 2, true,
                "A", 1, "mechanic", 30, 5,
                8);
        assertEquals(null, fridgeCamera.deleteModelInfo("dhvuhld"));
    }

    @Test
    void testGetMaxUsableCapacity(){
        FridgeCamera fridgeCamera = new FridgeCamera("Nexus", "dhvuhld", 2, true,
                "A", 1, "mechanic", 30, 5,
                8);
        assertEquals(20, fridgeCamera.getMaxUsableCapacity(2));
    }
}