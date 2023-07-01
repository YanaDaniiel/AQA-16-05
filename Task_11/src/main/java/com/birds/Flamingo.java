package com.birds;

public class Flamingo extends Bird {
    String family;

    public Flamingo(String name, String color, int age, String skinCovering, String[] food, String family) {
        super(name, color, age, skinCovering, food);
        setFamily(family);
    }

    public Flamingo(String family) {
        this.family = family;
    }

    public void setFamily(String family) {
        if (family != null) {
            this.family = family;
        } else {
            System.out.println("Family cannot be null!");
        }
    }

    public String getFamily() {
        return family;
    }
}


