package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Vlucht extends Stap {
    private final int kostenEuros;
    private final double kans;

    public Vlucht(String naam, Locatie startPunt, Locatie eindPunt, int kostenEuros, double kans) {
        super(naam, startPunt, eindPunt);
        this.kostenEuros = kostenEuros;
        this.kans = kans;
    }

    public int getKostenEuros() {
        return kostenEuros;
    }

    public double getKans() {
        return kans;
    }

    @Override
    public String toString() {
        return "Vlucht{ " + getNaam() +
                "kostenEuros=" + kostenEuros +
                ", kans=" + kans +
                '}';
    }

}
