package com.animals;

public abstract class Mammal extends Animal {
    private String skinCovering;
    private String[] food;

    public Mammal(String name, String color, int age, String skinCovering, String[] food) {
        super(name, color, age);
        setSkinCovering(skinCovering);
        setFood(food);
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
}
