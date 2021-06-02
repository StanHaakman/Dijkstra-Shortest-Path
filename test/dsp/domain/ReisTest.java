package dsp.domain;

import dsp.domain.stapSoorten.Autorit;
import dsp.domain.stapSoorten.Treinrit;
import dsp.domain.stapSoorten.Vlucht;
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
        /*
        In deze test ga ik alle 3 de soorten reizen.
        Voor iedere rit gebruik ik hetzelfde schema alleen dan met ander waardes voor de stappen
        om een ander resultaat te kunnen krijgen
         */

        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");
        Locatie c = new Locatie("C");
        Locatie d = new Locatie("D");

//        Autorit
        Reis autoReis = new Reis(a,c);

//        Autoreizen aanmaken
        Autorit autoritAB = new Autorit("A-B", a, b, 10);
        Autorit autoritBC = new Autorit("B-C", b, c, 30);
        Autorit autoritCD = new Autorit("C-D", c, d, 5);
        Autorit autoritDA = new Autorit("D-A", d, a, 60);
        Autorit autoritBD = new Autorit("B-D", b, d, 20);


//        De ritten toevoegen aan de Reis
        autoReis.addStap(autoritAB.getKostenEuros(), autoritAB);
        autoReis.addStap(autoritBC.getKostenEuros(), autoritBC);
        autoReis.addStap(autoritCD.getKostenEuros(), autoritCD);
        autoReis.addStap(autoritDA.getKostenEuros(), autoritDA);
        autoReis.addStap(autoritBD.getKostenEuros(), autoritBD);

//        Dijkstra algoritme uitvoeren
        autoReis.dijkstra();
        System.out.println(autoReis);

//        Treinrit
        Reis treinreis = new Reis(c, a);

//        Treinritten aanmaken
        Treinrit treinritAB = new Treinrit("A-B", a, b, 10);
        Treinrit treinritBC = new Treinrit("B-C", b, c, 20);
        Treinrit treinritCD = new Treinrit("C-D", c, d, 10);
        Treinrit treinritDA = new Treinrit("D-A", d, a, 60);
        Treinrit treinritBD = new Treinrit("B-D", b, d, 20);


//        De ritten toevoegen aan de Reis
        treinreis.addStap(treinritAB.getTijdMinuten(), treinritAB);
        treinreis.addStap(treinritBC.getTijdMinuten(), treinritBC);
        treinreis.addStap(treinritCD.getTijdMinuten(), treinritCD);
        treinreis.addStap(treinritDA.getTijdMinuten(), treinritDA);
        treinreis.addStap(treinritBD.getTijdMinuten(), treinritBD);

//        Dijkstra uitvoeren
        treinreis.dijkstra();
        System.out.println(treinreis);

//        Vliegreis
        Reis vliegreis = new Reis(a, c);

//        Vluchten aanmaken
        Vlucht vluchtenAB = new Vlucht("A-B", a, b, 10, 60);
        Vlucht vluchtenBC = new Vlucht("B-C", b, c, 20, 20);
        Vlucht vluchtenCD = new Vlucht("C-D", c, d, 10, 10);
        Vlucht vluchtenDA = new Vlucht("D-A", d, a, 13, 20);
        Vlucht vluchtenBD = new Vlucht("B-D", b, d, 20, 10);


//        De ritten toevoegen aan de Reis
        vliegreis.addStap(vluchtenAB.getKostenEuros(), vluchtenAB, vluchtenAB.getKans());
        vliegreis.addStap(vluchtenBC.getKostenEuros(), vluchtenBC, vluchtenBC.getKans());
        vliegreis.addStap(vluchtenCD.getKostenEuros(), vluchtenCD, vluchtenCD.getKans());
        vliegreis.addStap(vluchtenDA.getKostenEuros(), vluchtenDA, vluchtenDA.getKans());
        vliegreis.addStap(vluchtenBD.getKostenEuros(), vluchtenBD, vluchtenBD.getKans());

//        Dijkstra uitvoeren
        vliegreis.dijkstra();
        System.out.println(vliegreis);
    }
}