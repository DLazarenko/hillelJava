package lesson8;

public class GuideDog extends Pet {
    private boolean isTrained;

    GuideDog(int id, int age, double weight, String color, String name, boolean isVacctinated, boolean isTrained) {
        super(id, age, weight, color, name, isVacctinated);
        this.isTrained = isTrained;
    }

    public static void goHome() {
    }

    public String voise(boolean isTrained) {
        if (isTrained) {
            return super.voise() + " I can take you home.";
        }
        return super.voise();
    }
}