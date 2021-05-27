package dsp.domain;

public class Stap {
    private String naam;
    private Locatie startPunt;
    private Locatie eindPunt;

    public Stap(String naam, Locatie startPunt, Locatie eindPunt) {
        this.naam = naam;
        this.startPunt = startPunt;
        this.eindPunt = eindPunt;
    }

    public String getNaam() {
        return naam;
    }
}
