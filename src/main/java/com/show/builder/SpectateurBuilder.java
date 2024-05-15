package com.show.builder;


import com.show.*;
import com.show.reaction.Reaction;
import com.show.tour.Tour;

import java.util.ArrayList;
import java.util.List;

public class SpectateurBuilder  {
    List<ReactionObserver> reactionObservers = new ArrayList<>();
    public SpectateurBuilder withReactionObserver(ReactionObserver reactionObserver) {
        this.reactionObservers.add(reactionObserver);
        return this;
    }

    public Spectateur build() {
        Spectateur spectateur = new Spectateur(reactionObservers);
        return spectateur;
    }
}
