package com.show;

import com.show.tour.Tour;

import java.util.ArrayList;
import java.util.List;

public class Singe {
    public String name;
    public List<Tour> tours = new ArrayList<>();

    public Singe(String name, List<Tour> tours) {
        this.tours = tours;
        this.name = name;
    }

}
