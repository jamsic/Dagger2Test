package singleton;

import java.util.Random;

/**
 * Created by jamsic on 20.07.16.
 * Главный синглтон -- который должен быть один.
 */
public class MySingleton {
    private int someVariable;

    private MySingleton() {
        Random random = new Random();
        someVariable = random.nextInt(100);
    }

    private static class SingletonHelper{
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public int getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(int variable) {
        this.someVariable = variable;
    }
}

