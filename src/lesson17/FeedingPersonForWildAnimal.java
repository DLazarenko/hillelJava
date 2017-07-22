package lesson17;

import lesson17.observable.Observer;

public class FeedingPersonForWildAnimal implements Observer {
    @Override
    public void handle(Object message) {
        System.out.println("The animal is fed");
        if (message instanceof WildAnimal) {
            WildAnimal wildAnimal = (WildAnimal) message;
            wildAnimal.fed();
        }
    }
}