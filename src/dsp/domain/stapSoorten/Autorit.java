package dsp.domain.stapSoorten;

import dsp.domain.Locatie;
import dsp.domain.Stap;

public class Autorit extends Stap {
    private int kostenEuros;

    public Autorit(String indicatie, Locatie startPunt, Locatie eindPunt, int kostenEuros) {
        super(indicatie, startPunt, eindPunt);
        this.kostenEuros = kostenEuros;
    }

    public int getKostenEuros() {
        return kostenEuros;
    }

    @Override
    public String toString() {
        return "Autorit { " +
                "kostenEuros=" + kostenEuros +
                '}';
    }
}
