package singleton;

/**
 * Created by jamsic on 20.07.16.
 * просто некоторый посторонний класс
 */
public class SomeClass {

    ///*
    public void a(MySingleton mySingleton, Single single1) {
        Single single = DaggerSingle.builder().build();
        System.out.println("mySingleton == single.maker().getInstance() (single создан заново в функции): "
                + single.maker().getInstance().equals(mySingleton));
        System.out.println("mySingleton == single1.maker().getInstance() (single1 передан извне): "
                + single1.maker().getInstance().equals(mySingleton));
        System.out.println("mySingleton == SingletonMaker.getInstance(): "
                + SingletonMaker.getInstance().equals(mySingleton));
        SingletonMaker.getInstance().setSomeVariable(22);
    }
    //*/
}
