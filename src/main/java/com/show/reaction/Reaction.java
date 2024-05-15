package com.show.reaction;


import com.show.DescriptionProvider;
import com.show.Singe;
import com.show.TourObserver;
import com.show.tour.Tour;

public abstract class Reaction implements DescriptionProvider {
    Tour tour;
    Singe singe;
    TourObserver tourObserver;
    public void setSinge(Singe singe) {
        this.singe = singe;
    }
    public void setTourObserver(TourObserver tourObserver) {
        this.tourObserver = tourObserver;
    }
    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
