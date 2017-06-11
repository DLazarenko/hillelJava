package lesson8;

public class Fish extends Pet {
    Fish(int id, int age, double weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    @Override
    public String voice() {
        return "....";
    }
}

