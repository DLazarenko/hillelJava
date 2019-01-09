package designPatternStrategy;

public class FlyWithWinds implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!");
    }
}
