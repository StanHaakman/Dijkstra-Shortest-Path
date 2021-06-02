package dsp;

import dsp.domain.Locatie;
import dsp.domain.Reis;
import dsp.domain.stapSoorten.Autorit;
import dsp.domain.stapSoorten.Vlucht;

public class Main {

    public static void main(String[] args) {
        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");
        Locatie c = new Locatie("C");
        Locatie d = new Locatie("D");


        Autorit autoritAB = new Autorit("A-B", a, b, 10);
        Autorit autoritBC = new Autorit("B-C", b, c, 30);
        Autorit autoritCD = new Autorit("C-D", c, d, 5);
        Autorit autoritDA = new Autorit("D-A", d, a, 60);
        Autorit autoritBD = new Autorit("B-D", b, d, 20);

        Vlucht vluchtAB = new Vlucht("AB", a, b, 20, 20);

        Reis vliegrit =  new Reis(a, c);

        vliegrit.addStap(vluchtAB.getKostenEuros(), vluchtAB, vluchtAB.getKans());

        Reis autoReis = new Reis(a,c);

        autoReis.addStap(autoritAB.getKostenEuros(), autoritAB);
        autoReis.addStap(autoritBC.getKostenEuros(), autoritBC);
        autoReis.addStap(autoritCD.getKostenEuros(), autoritCD);
        autoReis.addStap(autoritDA.getKostenEuros(), autoritDA);
        autoReis.addStap(autoritBD.getKostenEuros(), autoritBD);

        autoReis.dijkstra();
        System.out.println(autoReis);
    }
}
