package lesson13;

public class BlueColor implements Color {
    @Override
    public int consumption() {
        return 1;
    }

    @Override
    public String name() {
        return "Blue";
    }

    @Override
    public int price() {
        return 1;
    }
}
