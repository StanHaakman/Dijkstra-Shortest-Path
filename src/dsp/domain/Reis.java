package dsp.domain;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Reis>{
    private Locatie beginStad;
    private Locatie eindStad;
    private List<Stap> stappen = new ArrayList<>();



    public void addStap(Stap x) {
        this.stappen.add(x);
    }

    @Override
    public String toString() {
        return "Reis{" +
                "stappen=" + stappen +
                '}';
    }

    @Override
    public int compareTo(Reis reis) {
        return 0;
    }

    public void shortestPath() {
        List<Stap> options = getValidStappen(this.beginStad);

        System.out.println(options);

        Locatie result = this.beginStad;

        while (!this.eindStad.equals(result)) {
            result = this.eindStad;
        }

        System.out.println(options);
        System.out.println("Het werkte");
    }

    private List<Stap> getValidStappen(Locatie CurrentPosition) {
        List<Stap> options = new ArrayList<>();
        for (Stap stap:
                this.stappen) {
            if (stap.getLocatieLinks() == CurrentPosition) {
                options.add(stap);
            }
        }
        return options;
    }
}
