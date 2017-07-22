package lesson17;

import lesson17.observable.Observer;

public class Hairdresser implements Observer {

    @Override
    public void handle(Object message) {
        System.out.println("The animal is combed");
        if(message instanceof Pet){
            Pet pet = (Pet) message;
            pet.combed();
            System.out.println("I am combed " + pet.voice());
        }
    }
}
