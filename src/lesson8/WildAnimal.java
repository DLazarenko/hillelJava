package lesson8;

public abstract class WildAnimal extends Animal {
    private boolean isPredator;

    WildAnimal(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }

    public String voice() {
        if (isPredator) {
            return super.voice() + ", I am a wild animal and I am angry.";
        }
        return super.voice() + ", I am a wild animal.";
    }
}