package designPatternStrategy;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        flyBehavior = new FlyWithWinds();
        quackBehavior = new Squeak();
    }
}
