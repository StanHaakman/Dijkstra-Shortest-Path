package dsp.domain;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable{
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
}
