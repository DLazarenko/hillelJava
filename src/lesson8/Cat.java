package lesson8;

public class Cat extends Pet {
    Cat(int id, int age, double weight, String color, String name, boolean isVacctinated) {
        super(id, age, weight, color, name, isVacctinated);
    }

    @Override
    public String voise() {
        return super.voise() + "Meow";
    }
}
