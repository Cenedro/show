package com.show.command;

import com.show.Singe;

public abstract class Command { // mieux singeCommand
    public Singe singe;
    Command(Singe singe) {
        this.singe = singe;
    }
    public abstract void execute();

}
