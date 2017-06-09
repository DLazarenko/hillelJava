package lesson8;

public class Animal {
    private int id;
    private int age;
    private double weight;
    private String color;

    Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String voise() {
        return "Hello, ";
    }
}