package lesson17;

import lesson17.observable.Observable;

public class Lion extends WildAnimal implements Observable {
    Lion(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }


}
