package dsp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapTest {

    @Test
    void getOther() {
        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");

        Stap aEnB = new Stap("A-B", a, b);

        assertEquals(aEnB.getOther(a), b);
        assertEquals(aEnB.getOther(b), a);
    }

    @Test
    void getLocatieLinks() {
        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");

        Stap aEnB = new Stap("A-B", a, b);
        assertEquals(aEnB.getLocatieLinks(), a);
        assertNotNull(aEnB.getLocatieLinks());
    }

    @Test
    void getLocatieRechts() {
        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");

        Stap aEnB = new Stap("A-B", a, b);
        assertEquals(aEnB.getLocatieRechts(), b);
        assertNotNull(aEnB.getLocatieRechts());
    }
}