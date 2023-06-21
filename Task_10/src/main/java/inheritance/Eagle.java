package inheritance;

public class Eagle extends Bird {
    String family;

    public Eagle(String name, String color, int age, String skinCovering, String[] food, String family) {
        super(name, color, age, skinCovering, food);
        this.family = family;
    }

    public Eagle(String name, String color, String family) {
        super(name, color);
        this.family = family;
    }

    public void getEagle() {
        StringBuilder eagleFood = new StringBuilder();
        for (String i : food) {
            eagleFood.append(i);
            eagleFood.append(" ");
        }
        System.out.println(super.name + " " + super.color + " " + super.age + " " + super.skinCovering + " " + eagleFood
                + " " + family);
    }
}
