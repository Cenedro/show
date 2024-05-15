package com.show;

import com.show.reaction.Reaction;

public interface ReactionObservable {
    public void registerReactionObserver(ReactionObserver reactionObserver);
    public void deregisterReactionObserver(ReactionObserver reactionObserver);
    public void setReaction(Reaction reaction);

}
