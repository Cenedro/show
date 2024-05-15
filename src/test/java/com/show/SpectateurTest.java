package com.show;

import com.show.builder.DresseurBuilder;
import com.show.builder.SingeBuilder;
import com.show.builder.SpectateurBuilder;
import com.show.reaction.ApplaudirReaction;
import com.show.reaction.Reaction;
import com.show.reaction.SifflerReaction;
import com.show.tour.Acrobatie;
import com.show.tour.Musique;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SpectateurTest {

    @Test
    public void spectateurShouldReactToTourIfThereIsAtLeastOneTour() {
        ReactionObserver mockReactionObserver = mock(ReactionObserver.class);

        Singe singe1 = new SingeBuilder().withName("singe 1")
                .addTour(new Acrobatie("marcher sur les mains"))
                .build();
        Dresseur dresseur = new DresseurBuilder().addSinge(singe1).build();

        Spectateur spectateur = new SpectateurBuilder()
                .withReactionObserver(mockReactionObserver)
                .build();

        dresseur.startToursForAudience(spectateur);
        verify(mockReactionObserver, times(1))
                .setReaction(any(Reaction.class));
    }

    @Test
    public void spectateurShouldApplauseIfAcrobaticIsPerformed() {
        ReactionObserver mockReactionObserver = mock(ReactionObserver.class);

        Singe singe1 = new SingeBuilder().withName("singe 1")
                .addTour(new Acrobatie("marcher sur les mains"))
                .build();
        Dresseur dresseur = new DresseurBuilder().addSinge(singe1).build();

        Spectateur spectateur = new SpectateurBuilder()
                .withReactionObserver(mockReactionObserver)
                .build();

        dresseur.startToursForAudience(spectateur);
        verify(mockReactionObserver, times(1))
                .setReaction(any(ApplaudirReaction.class));
    }

    @Test
    public void spectateurShouldWhistleIfMusicIsPerformed() {
        ReactionObserver mockReactionObserver = mock(ReactionObserver.class);

        Singe singe1 = new SingeBuilder().withName("singe 1")
                .addTour(new Musique("Rock"))
                .build();
        Dresseur dresseur = new DresseurBuilder().addSinge(singe1).build();

        Spectateur spectateur = new SpectateurBuilder()
                .withReactionObserver(mockReactionObserver)
                .build();

        dresseur.startToursForAudience(spectateur);
        verify(mockReactionObserver, times(1))
                .setReaction(any(SifflerReaction.class));
    }

    @Test
    public void spectateurShouldTheRightAmountOfTimesOnManyDifferentPerformance() {
        ReactionObserver mockReactionObserver = mock(ReactionObserver.class);

        Singe singe1 = new SingeBuilder().withName("singe 1")
                .addTour(new Musique("Rock"))
                .addTour(new Musique("Rock II"))
                .addTour(new Acrobatie("Marche sur les main"))
                .build();
        Dresseur dresseur = new DresseurBuilder().addSinge(singe1).build();

        Spectateur spectateur = new SpectateurBuilder()
                .withReactionObserver(mockReactionObserver)
                .build();

        dresseur.startToursForAudience(spectateur);

        verify(mockReactionObserver, times(2))
                .setReaction(any(SifflerReaction.class));

        verify(mockReactionObserver, times(1))
                .setReaction(any(ApplaudirReaction.class));

    }

}
