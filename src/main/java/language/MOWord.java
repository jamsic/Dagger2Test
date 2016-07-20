package language;

import javax.inject.Inject;

/**
 * Created by jamsic on 20.07.16.
 */
public class MOWord {
    public MOLetter moLetter;

    @Inject
    public MOWord(MOLetter moLetter) {
        System.out.println("Word is constructed");
        this.moLetter = moLetter;
    }
    /*
    public static void main(String[] args) {
        //MOWord word = new MOWord_Factory();
    }
    */
}
