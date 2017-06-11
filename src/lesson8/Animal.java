package lesson8;

public abstract class Animal {
    protected int id;
    protected int age;
    protected double weight;
    protected String color;

    Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String voice() {
        return "Hello";
    }
}