package lesson17;

import lesson17.observable.Observable;

public class Dog extends Pet implements Observable {
    private boolean isVaccinated;

    Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name);
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String voice() {
        return super.voice() + " Woof.";
    }


}
