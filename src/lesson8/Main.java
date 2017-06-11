package lesson8;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[9];
        animals[0] = new Cat(9, 1, 8.0, "black", "Battom", true);
        animals[1] = new Crocodile(9, 8, 212.1, "black", true);
        animals[2] = new Dog(9, 2, 7.5, "black", "Rex", false);
        animals[3] = new Fish(9, 1, 0.05, "black", "Nemo");
        animals[4] = new Giraffe(9, 3, 700.8, "black", false);
        animals[5] = new GuideDog(9, 8, 3.7, "black", "Hatiko", true, true);
        animals[6] = new Hamster(9, 5, 0.9, "black", "Homka");
        animals[7] = new Lion(9, 8, 20.6, "black", true);
        animals[8] = new Wolf(9, 7, 10.4, "black", true);
        for (Animal zoo : animals) {
            System.out.println(zoo.voice());
        }
    }
}
