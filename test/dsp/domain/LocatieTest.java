package dsp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocatieTest {

    @Test
    void testEquals() {

        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");

        assertFalse(a.equals(b));
        assertTrue(a.equals(a));
    }
}