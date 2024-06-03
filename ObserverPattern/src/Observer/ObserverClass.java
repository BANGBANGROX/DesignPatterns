package Observer;

import Observable.Observable;

public class ObserverClass implements Observer {
    private final Observable observable;

    public ObserverClass(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Data change : " + observable.getData().getNumber());
    }
}
