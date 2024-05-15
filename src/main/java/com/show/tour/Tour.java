package com.show.tour;


import com.show.ReactionCreator;
import com.show.reaction.Reaction;

public abstract class Tour implements ReactionCreator {
    public String type;
    public String name;
    Tour (String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract Reaction createReaction();
}
