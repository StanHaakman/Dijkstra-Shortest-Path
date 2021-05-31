package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Treinrit extends Stap {
    private int tijdMinuten;

    public Treinrit(String indicatie, Locatie locatieLinks, Locatie locatieRechts, int tijdMinuten) {
        super(indicatie, locatieLinks, locatieRechts);
        this.tijdMinuten = tijdMinuten;
    }

    public int getTijdMinuten() {
        return tijdMinuten;
    }

    @Override
    public String toString() {
        return "Treinrit { " +
                "tijdMinuten=" + tijdMinuten +
                '}';
    }
}
