package inheritance;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }
}
