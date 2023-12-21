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

    @Test
    void testFullAvecBrelanEtPaire() {
        int[] des = {2, 2, 2, 3, 3};
        assertEquals(30, YamsGame.score(des));
    }

    @Test
    void testFullSansCombinaisonValide() {
        int[] des = {1, 1, 2, 3, 4};
        assertNotEquals(30, YamsGame.score(des));
    }

    @Test
    void testGrandeSuiteAvecValeursSeSuivant() {
        int[] des = {1, 2, 3, 4, 5};
        assertEquals(40, YamsGame.score(des));
    }

    @Test
    void testGrandeSuiteSansSequenceComplete() {
        int[] des = {1, 2, 2, 4, 5};
        assertNotEquals(40, YamsGame.score(des));
    }

    @Test
    void testYamsAvecCinqValeursIdentiques() {
        int[] des = {6, 6, 6, 6, 6};
        assertEquals(50, YamsGame.score(des));
    }

    @Test
    void testYamsSansCinqValeursIdentiques() {
        int[] des = {6, 6, 6, 6, 3};
        assertNotEquals(50, YamsGame.score(des));
    }

    @Test
    void testChanceSansAutreCombinaison() {
        int[] des = {1, 3, 4, 5, 6};
        assertEquals(19, YamsGame.score(des));
    }
}
