package inheritance;

public abstract class Mammal extends Animal {
    String skinCovering;
    String food;

    public Mammal(String name, String color, int age, String skinCovering, String food) {
        super(name, color, age);
        this.skinCovering = skinCovering;
        this.food = food;
    }

    public Mammal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
