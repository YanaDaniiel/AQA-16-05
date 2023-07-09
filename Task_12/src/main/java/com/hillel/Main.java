package com.hillel;

import com.birds.Bird;
import com.birds.Eagle;
import com.birds.Flamingo;
import com.enums.Voice;

public class Main {
    public static void main(String[] args) {
        String[] eagleFood = new String[]{"small bird", "worm"};
        Eagle eagle = new Eagle("Petro", "brown", 10, "feather", eagleFood, 2, Voice.WHISTLE, "pair");
        eagle.getEagle();
        eagle.calculateOffspringsYearly();
        System.out.println(eagle.toString());
        System.out.println();

        String[] flamingoFood = new String[]{"small seeds", "algae"};
        Flamingo flamingo = new Flamingo("Boris", "pink", 5, "feather", flamingoFood, 1, Voice.HONK, "flock");
        flamingo.getFlamingo();
        flamingo.calculateOffspringsYearly();
        System.out.println(flamingo.toString());
    }
}
