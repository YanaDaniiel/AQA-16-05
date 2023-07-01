package com.animals;

public abstract class Mammal extends Animal {
    private String skinCovering;
    private String[] food;
    private String offsprings;

    public Mammal(String name, String color, int age, String skinCovering, String[] food, String offsprings) {
        super(name, color, age);
        setSkinCovering(skinCovering);
        setFood(food);
        setOffsprings(offsprings);
    }

    public Mammal() {
    }

    public void setSkinCovering(String skinCovering) {
        if (skinCovering != null) {
            this.skinCovering = skinCovering;
        } else {
            System.out.println("Skin covering cannot be null!");
        }
    }

    public String getSkinCovering() {
        return skinCovering;
    }

    public void setFood(String[] food) {
        if (food != null) {
            this.food = food;
        } else {
            System.out.println("Food cannot be null!");
        }
    }

    public String[] getFood() {
        return food;
    }

    public void setOffsprings(String offsprings) {
        if (offsprings != null) {
            this.offsprings = offsprings;
        } else {
            System.out.println("Offsprings cannot be null!");
        }
    }

    public String getOffsprings() {
        return offsprings;
    }

    @Override
    public String toString() {
        return "Override: Mammal data { " +
                "Mammal name ='" + getName() + '\'' +
                ", Mammal skin covering ='" + getSkinCovering() + '\'' +
                ", Mammal food ='" + getFood() + '\'' +
                ", Mammal offsprings ='" + getOffsprings() + '\'' +
                '}';
    }
}
