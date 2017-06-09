package lesson8;

public class WildAnimal extends Animal {
    private boolean isPredator;

    WildAnimal(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }

    public String voise(boolean isPredator) {
        if (isPredator) {
            return super.voise() + "I am a wild animal and I am angry.";
        }
        return super.voise() + "I am a wild animal.";
    }
}