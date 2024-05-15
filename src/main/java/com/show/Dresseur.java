package com.show;



import com.show.command.ExecuteAllTourCommand;

import java.util.ArrayList;
import java.util.List;

public class Dresseur {
    List<Singe> singes = new ArrayList<>();
    public Dresseur(List<Singe> singes) {
        this.singes = singes;
    }

    public void startToursForAudience(TourObserver to) {
        for (Singe singe : this.singes) {
            new ExecuteAllTourCommand(singe).forTourObserver(to).execute();
        }
    }
}
