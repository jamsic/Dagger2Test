package singleton;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * Created by jamsic on 20.07.16.
 * Класс, который держит MySingleton у себя
 * @Singleton обязательно должен куда-то инжектиться, вот он и делает это сюда
 */
public class SingletonMaker {
    private static Lazy<MySingleton> mySingleton;

    @Inject
    public SingletonMaker(Lazy<MySingleton> singleton) {
        this.mySingleton = singleton;
    }

    public static MySingleton getInstance() {
        return mySingleton.get();
    }
}
