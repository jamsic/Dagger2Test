package language;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jamsic on 20.07.16.
 */

@Module
public class MOLetterProvider {

    @Provides
    MOLetter MOLetter() {
        return new MOLetter();
    }
}
