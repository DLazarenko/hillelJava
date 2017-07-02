package lesson13;


public class GreenColor implements Color {

    @Override
    public int consumption() {
        return 10;
    }

    @Override
    public String name() {
        return "Green";
    }

    @Override
    public int price() {
        return 100;
    }

}
