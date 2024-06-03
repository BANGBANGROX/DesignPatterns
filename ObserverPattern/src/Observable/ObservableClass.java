package Observable;

import Observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class ObservableClass implements Observable {
    private final Set<Observer> observerSet;
    private final ObservableData observableData;

    public ObservableClass() {
        observerSet = new HashSet<>();
        observableData = new ObservableData(-1);
    }

    @Override
    public void add(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update();
        }
    }

    @Override
    public void setData(ObservableData observableData) {
        this.observableData.setNumber(observableData.getNumber());
        notifyObservers();
    }

    @Override
    public ObservableData getData() {
        return observableData;
    }
}
