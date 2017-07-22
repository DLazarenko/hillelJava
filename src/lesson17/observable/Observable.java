package lesson17.observable;

// наблюдаемый ( за кем )
public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
