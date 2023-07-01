package com.animals;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        setName(name);
        setColor(color);
        setAge(age);
    }

    public Animal(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Animal() {
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

    @Override
    public String toString() {
        return "Override: Animal data { " +
                "Animal name ='" + getName() + '\'' +
                ", Animal color ='" + getColor() + '\'' +
                ", Animal age ='" + getAge() + '\'' +
                '}';
    }
}
