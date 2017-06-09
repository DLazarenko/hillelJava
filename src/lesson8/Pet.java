package lesson8;

public class Pet extends Animal {
    private String name;
    private boolean isVacctinated;

    Pet(int id, int age, double weight, String color, String name, boolean isVacctinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVacctinated = isVacctinated;
    }

    public String voise() {
        return super.voise() + "my name is " + name;
    }
}
