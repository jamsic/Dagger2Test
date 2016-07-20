package language;

import dagger.Component;

/**
 * Created by jamsic on 20.07.16.
 */
public class MOWordApp {

    @Component(modules = { MOLetterProvider.class })
    public interface Lang {
        MOWord m();
    }

    public static void main(String[] args) {
        Lang lang = DaggerMOWordApp_Lang.builder().build();
        System.out.println(lang.m().moLetter.val);
    }
}
