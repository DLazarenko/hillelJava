package lesson17;

import lesson17.observable.Observer;

public class FeedingPersonForPet implements Observer {
    @Override
    public void handle(Object message) {
        System.out.println("The animal is fed");
        if (message instanceof Pet){
            Pet pet = (Pet) message;
            pet.fed();
        }
    }
}
