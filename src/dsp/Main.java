package dsp;

import dsp.domain.Locatie;
import dsp.domain.Reis;
import dsp.domain.stapSoorten.Autorit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Reis testreis = new Reis();

        Locatie amsterdam = new Locatie("Amsterdam");
        Locatie haarlem = new Locatie("Haarlem");
        Locatie utrecht = new Locatie("Utrecht");
        Locatie denhelder = new Locatie("Den Helder");
        Locatie denhaag = new Locatie("Den Haag");
        Locatie maastricht = new Locatie("Maastricht");
        Locatie leeuwarden = new Locatie("Leeuwarden");


        Autorit autoritAB = new Autorit("Amsterdam-Haarlem", amsterdam, haarlem, 50);

        testreis.addStap(autoritAB);
        System.out.println(testreis);
    }
}
