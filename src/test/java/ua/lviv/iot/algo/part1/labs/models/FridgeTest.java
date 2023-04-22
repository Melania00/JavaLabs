package ua.lviv.iot.algo.part1.labs.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.labs.models.WineFridge;

class FridgeTest {
    @Test
    void testIsDefrosting() {
        WineFridge wineFridge = new WineFridge("Samsung", "sgergr", 3, false,
                "B", 16, 5);
        assertFalse(false);
    }

    private void assertFalse(boolean isDefrosting) {
    }
}
