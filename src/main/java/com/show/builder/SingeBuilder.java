package com.show.builder;


import com.show.Singe;
import com.show.tour.Tour;

import java.util.ArrayList;
import java.util.List;

public class SingeBuilder {
    List<Tour> tours = new ArrayList<>();
    String name;
    public SingeBuilder addTour(Tour tour) {
        tours.add(tour);
        return this;
    }
    public SingeBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public Singe build() {
        Singe singe = new Singe(name, tours);
        return singe;
    }
}
