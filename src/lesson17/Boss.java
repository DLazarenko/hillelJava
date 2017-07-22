package lesson17;

import lesson17.observable.Observer;

public class Boss implements Observer {
    @Override
    public void handle(Object message) {
        System.out.println("boss know " + message);
    }
}
