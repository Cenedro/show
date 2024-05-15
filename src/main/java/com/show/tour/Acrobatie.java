package com.show.tour;


import com.show.reaction.ApplaudirReaction;
import com.show.reaction.Reaction;

public class Acrobatie extends Tour {
    public Acrobatie(String name) {
        super("le tour d'acrobatie", name);
    }

    @Override
    public Reaction createReaction() {
        return new ApplaudirReaction();
    }
}
