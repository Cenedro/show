package com.show.reaction;

import com.show.DescriptionProvider;

public class ApplaudirReaction extends Reaction {
    private static final String action = "applaudit";
    @Override
    public String description() {
        return "spectateur " + action + " pendant " + this.tour.type + " '" + this.tour.name + "' du " + this.singe.name;
    }
}
