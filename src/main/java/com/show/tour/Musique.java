package com.show.tour;


import com.show.reaction.Reaction;
import com.show.reaction.SifflerReaction;

public class Musique extends Tour {
    public Musique(String name) {
        super("le tour de musique", name);
    }

    @Override
    public Reaction createReaction() {
        return new SifflerReaction();
    }
}
