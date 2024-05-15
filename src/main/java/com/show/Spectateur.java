package com.show;


import com.show.reaction.Reaction;
import com.show.tour.Tour;

import java.util.ArrayList;
import java.util.List;

public class Spectateur implements TourObserver, ReactionObservable {
    List<ReactionObserver> reactionObservers = new ArrayList<>();

    public Spectateur(List<ReactionObserver> reactionObservers) {
        this.reactionObservers = reactionObservers;
    }

    @Override
    public void registerReactionObserver(ReactionObserver reactionObserver) {
        reactionObservers.add(reactionObserver);
    }

    @Override
    public void deregisterReactionObserver(ReactionObserver reactionObserver) {
        reactionObservers.remove(reactionObserver);
    }

    @Override
    public void observe(Singe singe, Tour tour) {
        Reaction reaction = ReactionFactory.create(this, singe, tour);
        setReaction(reaction);
    }

    @Override
    public void setReaction(Reaction reaction) {
        for(ReactionObserver reactionObserver: this.reactionObservers) {
            reactionObserver.setReaction(reaction);
        }
    }
}
