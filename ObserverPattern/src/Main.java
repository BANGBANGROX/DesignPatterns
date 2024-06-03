import Observable.ObservableClass;
import Observable.ObservableData;
import Observer.ObserverClass;

public class Main {
    public static void main(String[] args) {
        ObservableClass observableClass = new ObservableClass();
        ObserverClass observer1 = new ObserverClass(observableClass);
        ObserverClass observer2 = new ObserverClass(observableClass);
        ObservableData observableData = new ObservableData(100);

        observableClass.add(observer1);
        observableClass.add(observer2);
        observableClass.setData(observableData);

        observableClass.remove(observer2);
        observableData.setNumber(123);
        observableClass.setData(observableData);
    }
}
