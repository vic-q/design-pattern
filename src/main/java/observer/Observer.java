package observer;

/**
 * @author guangda
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    void onChange(S subject, A args);
}
