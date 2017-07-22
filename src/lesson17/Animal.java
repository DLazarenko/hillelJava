package lesson17;

import com.sun.javafx.binding.StringFormatter;
import lesson17.observable.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {
    protected int id;
    protected int age;
    protected double weight;
    protected String color;
    private boolean isSick;
    private boolean isHungry;

    Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void sick() {
        sickAnimal();
        System.out.println("I am sick - " + id + " " + new Date());
        notifyObservers();
    }

    private List<Observer> observers = new ArrayList<>();
    private List<Observer> observersForHungry = new ArrayList<>();


    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    public void addObserverForHungry(Observer observer) {
        observersForHungry.add(observer);

    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handle(this);
        }
    }

    public void notifyObserversForHungry() {
        for (Observer observer : observersForHungry) {
            observer.handle(this);
        }
    }

    public boolean isSick() {
        return isSick;
    }

    public void sickAnimal() {
        isSick = true;
    }


    public void healed() {
        isSick = false;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void hungryAnimal() {
        isHungry = true;
    }

    public void fed() {
        isHungry = false;
    }

    public void feed() {
        hungryAnimal();
        System.out.println("I am hungry - " + id + " " + new Date());
        notifyObserversForHungry();
    }

    public String voice() {
        return "Hello";
    }
}