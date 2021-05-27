package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Treinrit extends Stap {
    private int tijdMinuten;

    public Treinrit(String naam, Locatie startPunt, Locatie eindPunt, int tijdMinuten) {
        super(naam, startPunt, eindPunt);
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
