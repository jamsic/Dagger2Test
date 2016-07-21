package singleton;

import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by jamsic on 20.07.16.
 * Входная точка. Этот класс никак не свзязан с MySingleton, просто создает его в main.
 * Объект MySingleton теперь один, если вызывать через single.maker().getInstance()
 * Если делать через обычный конструктор, так не получится.
 */
public class SingletonApp {

    public static void main(String[] args) {
        ///*
        Single single = DaggerSingle.builder().build();
        // создаем синглтон через single.maker().getInstance();
        MySingleton mySingleton = single.maker().getInstance();
        System.out.println("новый объект mySingleton, mySingleton.getSomeVariable(): "
                + mySingleton.getSomeVariable() + "\nи ещё один, mySingleton1");
        // и ещё раз
        MySingleton mySingleton1 = single.maker().getInstance();
        // они одинаковы
        System.out.println("mySingleton.equals(mySingleton1): "
                + mySingleton.equals(mySingleton1));
        MySingleton mySingleton4 = single.maker().getInstance();
        System.out.println("mySingleton4.getSomeVariable() (mySingleton4 = single.maker().getInstance()): "
                + mySingleton4.getSomeVariable());
        // назначим mySingleton var = mySingleton4.var + 1
        mySingleton.setSomeVariable(mySingleton4.getSomeVariable() + 1);
        // у mySingleton4 var тоже поменялся!
        System.out.println("mySingleton4.getSomeVariable()" +
                " (mySingleton.setSomeVariable(mySingleton4.getSomeVariable() + 1)): "
                + mySingleton4.getSomeVariable() + " " + mySingleton.getSomeVariable() + " " + mySingleton1.getSomeVariable());

        SomeClass someClass = new SomeClass();
        // внутри метода некоторого класса
        someClass.a(mySingleton, single);
        // поменяли значение var внутри метода постороннего класса, изменилось и тут во всех экземплярах.
        System.out.println(SingletonMaker.getInstance().getSomeVariable());
        System.out.println(mySingleton.getSomeVariable());

        Single single1 = DaggerSingle.builder().build();
        System.out.println(single1.maker().getInstance().equals(single.maker().getInstance()));
        //*/

        SomeThread someThread = new SomeThread();
        Thread thread = new Thread(someThread);
        thread.start();

        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                int rand = random.nextInt(100);
                sleep(rand);
                if (rand < 50) {
                    System.out.println("main " + SingletonMaker.getInstance().getSomeVariable());
                } else {
                    SingletonMaker.getInstance().setSomeVariable(rand);
                    System.out.println("main set to " + rand);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // то есть MySingleton ведут себя, как много ссылок на один и тот же объект,если создавать через single.maker
        // или SingletonMaker.getInstance()
    }
}
