package singleton;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by jamsic on 20.07.16.
 */
    @Singleton
    @Component(modules = { SingletonProvider.class })
    public interface Single {
        SingletonMaker maker();
    }
