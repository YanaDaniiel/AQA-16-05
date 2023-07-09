package com.birds;

public class Flamingo extends Bird {
    String family;

    public Flamingo(String name, String color, int age, String skinCovering, String[] food, int offsprings, String family) {
        super(name, color, age, skinCovering, food, offsprings);
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

    public void getFlamingo() {
        StringBuilder flamingoFood = new StringBuilder();
        for (String i : getFood()) {
            flamingoFood.append(i);
            flamingoFood.append(" ");
        }
        System.out.println("Name: " + super.getName() + ", color: " + super.getColor() + ", age: " + super.getAge()
                + ", skin covering: " + super.getSkinCovering() + ", eats: " + flamingoFood +
                ", no of offsprings born yearly: " + super.getOffsprings() + ", family type: " + family);
    }

    @Override
    public int calculateOffspringsYearly() {
        int offspringsYearly = getAge() * getOffsprings();
        setOffsprings(offspringsYearly);
        System.out.println(String.format("Flamingo offsprings born in %d years: %d", super.getAge(), offspringsYearly));
        return offspringsYearly;
    }

    @Override
    public String toString() {
        return "Override: Flamingo offsprings { " +
                "Flamingo age ='" + getAge() + '\'' +
                ", No of offsprings born by now ='" + getOffsprings() + '\'' +
                '}';
    }
}
