package com.birds;

public class Eagle extends Bird {
    private String family;

    public Eagle(String name, String color, int age, String skinCovering, String[] food, String family) {
        super(name, color, age, skinCovering, food);
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
        System.out.println(super.getName() + " " + super.getColor() + " " + super.getAge() + " "
                + super.getSkinCovering() + " " + eagleFood + " " + family);
    }
}


