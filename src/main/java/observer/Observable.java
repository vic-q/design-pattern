package observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author guangda
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    private final List<O> observers;

    protected Observable() {
        this.observers = Lists.newCopyOnWriteArrayList();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(A args) {
        for (O observer : this.observers) {
            observer.onChange((S) this, args);
        }
    }

}
