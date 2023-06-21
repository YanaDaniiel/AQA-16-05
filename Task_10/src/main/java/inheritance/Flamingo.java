package inheritance;

public class Flamingo extends Bird {
    String family;

    public Flamingo(String name, String color, int age, String skinCovering, String[] food, String family) {
        super(name, color, age, skinCovering, food);
        this.family = family;
    }

    public Flamingo(String name, String color, String family) {
        super(name, color);
        this.family = family;
    }
}
