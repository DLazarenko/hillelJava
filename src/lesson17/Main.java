package lesson17;

import java.util.List;

public class Main {
    public static Giraffe giraffe;
    public static Dog dog;
    public static Cat cat;
    public static Lion lion;

    public static Zoo init() {
        Zoo zoo = new Zoo();
        giraffe = new Giraffe(6, 12, 89, "red", false);
        zoo.add(giraffe);
        dog = new Dog(12, 3, 6.8, "white", "Rex", true);
        zoo.add(dog);
        cat = new Cat(8, 7, 3, "green", "Vasya", true);
        zoo.add(cat);
        lion = new Lion(13, 4, 100, "yellow", true);
        zoo.add(lion);
        return zoo;
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        Zoo zoo = init();
        Doctor doctor = new Doctor();
        giraffe.addObserver(doctor);
        giraffe.addObserver(boss);
        giraffe.sick();
        System.out.println(giraffe.isSick());
        FeedingPersonForWildAnimal feedingPersonForWildAnimal = new FeedingPersonForWildAnimal();
        lion.addObserverForHungry(feedingPersonForWildAnimal);
        lion.addObserverForHungry(boss);
        lion.feed();
        System.out.println(lion.isHungry());
        Hairdresser hairdresser = new Hairdresser();
        cat.addObserverForComb(hairdresser);
        cat.addObserverForComb(boss);
        cat.combMe();
        System.out.println(cat.isCombed());
    }
}
