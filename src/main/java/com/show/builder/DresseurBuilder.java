package com.show.builder;


import com.show.Dresseur;
import com.show.Singe;

import java.util.ArrayList;
import java.util.List;

public class DresseurBuilder {
    List<Singe> singes = new ArrayList<>();
    public DresseurBuilder addSinge(Singe singe) {
        this.singes.add(singe);
        return this;
    }
    public Dresseur build() {
        Dresseur dresseur = new Dresseur(this.singes);
        return dresseur;
    }
}
