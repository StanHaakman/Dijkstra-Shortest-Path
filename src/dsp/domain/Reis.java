package dsp.domain;

import dsp.domain.stapSoorten.Autorit;

import java.util.*;

public class Reis implements Comparable<Reis>{
    private Locatie beginStad;
    private Locatie eindStad;
    private Map<Stap, Integer> stappen = new HashMap<>();
    private Map<Stap, Integer> journey = new HashMap<>();

    public Reis(Locatie beginStad, Locatie eindStad) {
        this.beginStad = beginStad;
        this.eindStad = eindStad;
    }

    public void addStap(Integer value, Stap x) {
        this.stappen.put(x, value);
    }

    @Override
    public String toString() {
        return "Reis{" +
                "beginStad=" + beginStad +
                ", eindStad=" + eindStad +
                ", journey=" + journey +
                '}';
    }

    @Override
    public int compareTo(Reis reis) {
        return 0;
    }

    public void dijkstra() {
        Map<Stap, Integer> options = getValidStappen(this.beginStad);

        Locatie result = this.beginStad;

        while (!this.eindStad.equals(result)) {
            Map<Stap, Integer> next = getShortestPath(options);
            Stap nextStap = (Stap) next.keySet().toArray()[0];
            System.out.println(next);
            journey.put(nextStap, next.get(nextStap));
            result = nextStap.getOther(result);
            options = getValidStappen(result);
        }
    }

    private Map<Stap, Integer> getValidStappen(Locatie CurrentPosition) {
        Map<Stap, Integer> options = new HashMap<>();
        for (Stap key:
                this.stappen.keySet()) {
            if (key.getLocatieLinks() == CurrentPosition || key.getLocatieRechts() == CurrentPosition) {
                if (!journey.containsKey(key)) {
                    options.put(key, this.stappen.get(key));
                }
            }
        }
        return options;
    }

    private Map<Stap, Integer> getShortestPath(Map<Stap, Integer> stappen) {
        Map<Stap, Integer> shortest = new HashMap<>();

        Stap min = null;
        for (Stap key:
             stappen.keySet()) {
            if (stappen.get(key) < stappen.getOrDefault(min, 100000)) {
                min = key;
            }
        }
        shortest.put(min, stappen.get(min));
        return shortest;
    }
}
