package com.hillel;

import com.birds.Eagle;

public class Main {
    public static void main(String[] args) {
        String[] eagleFood = new String[]{"small bird", "worm"};
        Eagle eagle = new Eagle("Petro", "brown", 10, "feather", eagleFood, "pair");
        eagle.getEagle();
    }
}
