package singleton;

import javax.inject.Inject;

/**
 * Created by jamsic on 20.07.16.
 * Класс, который держит MySingleton у себя
 * @Singleton обязательно должен куда-то инжектиться, вот он и делает это сюда
 */
public class SingletonMaker {
    private static MySingleton mySingleton;

    @Inject
    public SingletonMaker(MySingleton singleton) {
        this.mySingleton = singleton;
    }

    public static MySingleton getInstance() {
        return mySingleton;
    }
}
