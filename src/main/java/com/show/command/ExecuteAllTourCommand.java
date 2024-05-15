package com.show.command;


import com.show.Singe;
import com.show.TourObserver;
import com.show.tour.Tour;

public class ExecuteAllTourCommand extends Command {
    public TourObserver tourObserver;

    public ExecuteAllTourCommand(Singe singe) {
        super(singe);
    }
    public Command forTourObserver(TourObserver tourObserver) {
        this.tourObserver = tourObserver;
        return this;
    }

    @Override
    public void execute() {
        for (Tour tour : this.singe.tours) {
            if (this.tourObserver != null) {
                this.tourObserver.observe(this.singe, tour);
            }
        }
    }
}
