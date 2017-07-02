package lesson13;


public class RedColor implements Color {

    @Override
    public int consumption() {
        return 2;
    }

    @Override
    public String name() {
        return "Red";
    }

    @Override
    public int price() {
        return 150;
    }
}
