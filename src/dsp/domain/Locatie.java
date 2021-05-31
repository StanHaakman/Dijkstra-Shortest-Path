package dsp.domain;

import java.util.Objects;

public class Locatie {
    private String naam;

    public Locatie(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locatie locatie = (Locatie) o;
        return Objects.equals(naam, locatie.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }
}
