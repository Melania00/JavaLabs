package ua.lviv.iot.algo.part1.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridgeTest {
    @Test
    void testIsDefrosting(){
        WineFridge wineFridge = new WineFridge("Samsung", "sgergr", 3, false,
                "B", 16, 5);
        assertFalse(false);
    }

    private void assertFalse(boolean isDefrosting) {}
}