import java.util.ArrayList;
import java.util.List;

abstract public class Bar {
    private List<BarObserver> observers;

    public abstract boolean isHappyHour();
    public void startHappyHour() {};
    public void endHappyHour() {};
    public Bar(){
        this.observers = new ArrayList<BarObserver>();
    }
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
