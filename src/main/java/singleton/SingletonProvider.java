package singleton;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by jamsic on 20.07.16.
 * Класс, который удовлетворяет зависимость SingletonMaker от MySingleton, причем так, что MySingleton становится
 * синглтоном.
 */

@Module
public class SingletonProvider {
    @Provides
    @Singleton MySingleton provideSingleton() {
        return MySingleton.getInstance();
    }
}
