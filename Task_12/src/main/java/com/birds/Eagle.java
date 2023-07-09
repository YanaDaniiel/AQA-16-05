package com.birds;

import com.enums.Voice;

public class Eagle extends Bird {
    private String family;

    public Eagle(String name, String color, int age, String skinCovering, String[] food, int offsprings, Voice voice, String family) {
        super(name, color, age, skinCovering, food, offsprings, voice);
        setFamily(family);
    }

    public Eagle(String family) {
        setFamily(family);
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

    public void getEagle() {
        StringBuilder eagleFood = new StringBuilder();
        for (String i : getFood()) {
            eagleFood.append(i);
            eagleFood.append(" ");
        }
        System.out.println("Name: " + super.getName() + ", color: " + super.getColor() + ", age: " + super.getAge()
                + ", skin covering: " + super.getSkinCovering() + ", eats: " + eagleFood
                + ", no of offsprings born yearly: " + super.getOffsprings() + ", voice: " + super.getVoice()
                + ", family type: " + family);
    }

    @Override
    public int calculateOffspringsYearly() {
        int offspringsYearly = (getAge() * getOffsprings()) - 1;
        setOffsprings(offspringsYearly);
        System.out.println(String.format("Eagle offsprings born in %d years: %d", super.getAge(), offspringsYearly));
        return offspringsYearly;
    }

    @Override
    public String toString() {
        return "Override: Eagle offsprings { " +
                "Eagle age ='" + getAge() + '\'' +
                ", No of offsprings born by now ='" + getOffsprings() + '\'' +
                '}';
    }
}
