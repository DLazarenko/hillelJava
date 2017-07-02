package lesson13;

public class BlueColor implements Color {

    @Override
    public int consumption() {
        return 5;
    }

    @Override
    public String name() {
        return "Blue";
    }

    @Override
    public int price() {
        return 120;
    }
}