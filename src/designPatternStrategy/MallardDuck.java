package designPatternStrategy;

public class MallardDuck extends Duck {
    MallardDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new SilentQuack();
    }
}
