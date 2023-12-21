package com.example.cleancodeproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class YamsGameTest {

    @Test
    void testBrelanAvecTroisValeursIdentiques() {
        int[] des = {2, 2, 2, 4, 5};
        assertEquals(28, YamsGame.score(des));
    }

    @Test
    void testBrelanAvecValeursDifferentes() {
        int[] des = {1, 2, 3, 4, 6};
        assertNotEquals(28, YamsGame.score(des));
    }

    @Test
    void testCarreAvecQuatreValeursIdentiques() {
        int[] des = {4, 4, 4, 4, 5};
        assertEquals(35, YamsGame.score(des));
    }

    @Test
    void testCarreAvecValeursDifferentes() {
        int[] des = {1, 2, 3, 4, 5};
        assertNotEquals(35, YamsGame.score(des));
    }
}
