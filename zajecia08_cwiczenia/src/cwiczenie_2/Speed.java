package cwiczenie_2;

import java.util.Scanner;

public enum Speed {
    SLOW (30),
    NORMAL (90),
    FAST (150);

    private final int howSpeed;

    private Speed(int howSpeed){
        this.howSpeed = howSpeed;
    }

    public int getHowSpeed() {
        return howSpeed;
    }
}
