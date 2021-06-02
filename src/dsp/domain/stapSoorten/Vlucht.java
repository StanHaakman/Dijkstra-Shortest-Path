package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Vlucht extends Stap {
    private final int kostenEuros;
    private final int kans;

    public Vlucht(String indicatie, Locatie locatieLinks, Locatie locatieRechts, int kostenEuros, int kans) {
        super(indicatie, locatieLinks, locatieRechts);
        this.kostenEuros = kostenEuros;
        this.kans = kans;
    }

    public int getKostenEuros() {
        return kostenEuros;
    }

    public int getKans() {
        return kans;
    }

    @Override
    public String toString() {
        return "Vlucht{ " +
                super.getIndicatie() +
                " kostenEuros=" + kostenEuros +
                ", kans=" + kans +
                '}';
    }

}
