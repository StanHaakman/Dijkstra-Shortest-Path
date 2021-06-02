package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Autorit extends Stap {
    private int kostenEuros;

    public Autorit(String indicatie, Locatie locatieLinks, Locatie locatieRechts, int kostenEuros) {
        super(indicatie, locatieLinks, locatieRechts);
        this.kostenEuros = kostenEuros;
    }

    public int getKostenEuros() {
        return kostenEuros;
    }

    @Override
    public String toString() {
        return "Autorit { " +
                super.getIndicatie() +
                " kostenEuros=" + kostenEuros +
                '}';
    }
}
