package lesson17;

import lesson17.observable.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal {
    protected String name;
    private boolean isCombed;

    Pet(int id, int age, double weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
    }

    private List<Observer> observersForComb = new ArrayList<>();

    @Override
    public String voice() {
        return super.voice() + ", my name is " + name + ".";
    }


    public boolean isCombed() {
        return isCombed;
    }

    public void combAnimal() {
        isCombed = false;
    }

    public void combMe() {
        combAnimal();
        System.out.println("I need a new hairstyle " + id + " " + new Date());
        notifyObserversForComb();
    }

    public void combed() {
        isCombed = true;
    }

    public void addObserverForComb(Observer observer) {
        observersForComb.add(observer);

    }

    public void notifyObserversForComb() {
        for (Observer observer : observersForComb) {
            observer.handle(this);
        }

    }
}