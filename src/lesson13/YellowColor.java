package lesson13;

public class YellowColor implements Color {

    @Override
    public int consumption() {
        return 90;
    }

    @Override
    public String name() {
        return "Yellow";
    }

    @Override
    public int price() {
        return 70;
    }
}