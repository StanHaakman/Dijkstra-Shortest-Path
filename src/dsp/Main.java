package dsp;

import dsp.domain.Locatie;
import dsp.domain.Reis;
import dsp.domain.stapSoorten.Autorit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Reis autoReis = new Reis();

        Locatie a = new Locatie("A");
        Locatie b = new Locatie("B");
        Locatie c = new Locatie("C");
        Locatie d = new Locatie("D");


        Autorit autoritAB = new Autorit("A-B", a, b, 10);
        Autorit autoritBC = new Autorit("B-C", b, c, 30);
        Autorit autoritCD = new Autorit("C-D", c, d, 5);
        Autorit autoritDA = new Autorit("D-A", c, d, 60);
        Autorit autoritBD = new Autorit("C-D", c, d, 20);

        autoReis.addStap(autoritAB);
        autoReis.addStap(autoritBC);
        autoReis.addStap(autoritCD);
        autoReis.addStap(autoritDA);
        autoReis.addStap(autoritBD);
        System.out.println(autoReis);
    }
}
