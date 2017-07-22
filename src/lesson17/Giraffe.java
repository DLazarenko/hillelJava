package lesson17;

import lesson17.observable.Observable;

public class Giraffe extends WildAnimal implements Observable {
    Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
