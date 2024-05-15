package com.show;


import com.show.tour.Tour;
import com.show.reaction.Reaction;

public class ReactionFactory {
    public static Reaction create(TourObserver tourObserver, Singe singe, Tour tour) {
        Reaction reaction = tour.createReaction();
        reaction.setTour(tour);
        reaction.setTourObserver(tourObserver);
        reaction.setSinge(singe);
        return reaction;
    }
}
