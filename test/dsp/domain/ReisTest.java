package dsp.domain;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {

    @Test
    void addStap() {
        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");
        Reis testreis = new Reis(a,b);
        Stap ab = new Stap("A-B", a, b);

        Map<Stap, Integer> testMap = new HashMap<>();
        assertEquals(testreis.getStappen(), testMap);
        testreis.addStap(1, ab);
        testMap.put(ab, 1);
        assertEquals(testreis.getStappen(), testMap);
    }

    @Test
    void dijkstra() {
//        In deze test ga ik alle 3 de soorten reizen
    }
}