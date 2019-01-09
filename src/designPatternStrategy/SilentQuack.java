package designPatternStrategy;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println(" --- ");
    }
}
