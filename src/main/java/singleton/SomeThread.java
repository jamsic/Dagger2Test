package singleton;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by jamsic on 21.07.16.
 */
public class SomeThread implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                int rand = random.nextInt(100);
                sleep(rand);
                if (rand < 50) {
                    System.out.println("concurrent " + SingletonMaker.getInstance().getSomeVariable());
                } else {
                    SingletonMaker.getInstance().setSomeVariable(rand);
                    System.out.println("concurrent set to " + rand);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
