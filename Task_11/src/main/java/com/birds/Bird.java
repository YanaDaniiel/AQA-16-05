package com.birds;

public abstract class Bird {

    private String name;
    private String color;
    private int age;
    private String skinCovering;
    private String[] food;

    public Bird(String name, String color, int age, String skinCovering, String[] food) {
        setName(name);
        setColor(color);
        setAge(age);
        setSkinCovering(skinCovering);
        setFood(food);
    }

    public Bird() {
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null!");
        }
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            System.out.println("Color cannot be null!");
        }
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        if (age != 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot equal 0!");
        }
    }

    public int getAge() {
        return age;
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
