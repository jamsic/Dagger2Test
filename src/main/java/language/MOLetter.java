package language;

import javax.inject.Inject;

/**
 * Created by jamsic on 20.07.16.
 */
public class MOLetter {
    public String val;

    @Inject
    public MOLetter() {
        System.out.println("letter is constructed");
        this.val = "c";
    }
}
