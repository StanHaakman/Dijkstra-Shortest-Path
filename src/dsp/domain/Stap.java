package dsp.domain;

public class Stap {
    private String indicatie;
    private Locatie startPunt;
    private Locatie eindPunt;

    public Stap(String indicatie, Locatie startPunt, Locatie eindPunt) {
        this.indicatie = indicatie;
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
    }

    public String getNaam() {
        return indicatie;
    }

    public Locatie getStartPunt() {
        return startPunt;
    }

    public Locatie getEindPunt() {
        return eindPunt;
    }
}
