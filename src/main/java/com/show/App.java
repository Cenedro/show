package com.show;


import com.show.builder.DresseurBuilder;
import com.show.builder.SingeBuilder;
import com.show.builder.SpectateurBuilder;
import com.show.tour.Acrobatie;
import com.show.tour.Musique;

public class App
{
    public static void main(String [] args) {
        //cabling
        Singe singe1 = new SingeBuilder().withName("singe 1")
                .addTour(new Acrobatie("marcher sur les mains"))
                .addTour(new Acrobatie("faire une roulade"))
                .build();

        Singe singe2 = new SingeBuilder().withName("Singe 2")
                .addTour(new Acrobatie("balade toi"))
                .addTour(new Musique("joue une ballade"))
                .build();

        Dresseur dresseur1 = new DresseurBuilder().addSinge(singe1).build();
        Dresseur dresseur2 = new DresseurBuilder().addSinge(singe2).build();

        Show show = new Show(System.out);

        Spectateur spectateur = new SpectateurBuilder()
                .withReactionObserver(show)
                .build();

        // run
        dresseur1.startToursForAudience(spectateur);
        dresseur2.startToursForAudience(spectateur);

    }
}
