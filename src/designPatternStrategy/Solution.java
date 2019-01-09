package designPatternStrategy;

public class Solution {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
        mallardDuck.performQuack();
        Duck redheadDuck = new RedheadDuck();
        redheadDuck.performFly();
        redheadDuck.performQuack();
    }

}
