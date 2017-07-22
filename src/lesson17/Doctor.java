package lesson17;

import lesson17.observable.Observer;

public class Doctor implements Observer {

    @Override
    public void handle(Object message) {
        System.out.println("You are healed");
        if (message instanceof Animal) {
            Animal animal = (Animal) message;
            animal.healed();
        }
    }
}
