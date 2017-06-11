package lesson8;

public abstract class Pet extends Animal {
    protected String name;

    Pet(int id, int age, double weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
    }

    @Override
    public String voice() {
        return super.voice() + ", my name is " + name + ".";
    }
}
