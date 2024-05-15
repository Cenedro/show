package com.show;


import com.show.reaction.Reaction;

import java.io.PrintStream;

public class Show implements ReactionObserver {
    PrintStream out;
    public Show(PrintStream out) {
        this.out = out;
    }
    @Override
    public void setReaction(Reaction reaction) {
        this.out.println(reaction.description());
    }
}
