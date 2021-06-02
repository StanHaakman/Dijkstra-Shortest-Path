package dsp.domain;

public class Stap {
    private String indicatie;
    private Locatie locatieLinks;
    private Locatie locatieRechts;

    public Stap(String indicatie, Locatie locatieLinks, Locatie locatieRechts) {
        this.indicatie = indicatie;
        this.locatieLinks = locatieLinks;
        this.locatieRechts = locatieRechts;
    }

    public Locatie getOther(Locatie current) {
        if (this.locatieLinks.equals(current)) {
            return this.locatieRechts;
        } else if (this.locatieRechts.equals(current)) {
            return this.locatieLinks;
        }
        return null;
    }

    public String getNaam() {
        return indicatie;
    }

    public Locatie getLocatieLinks() {
        return locatieLinks;
    }

    public Locatie getLocatieRechts() {
        return locatieRechts;
    }
}
