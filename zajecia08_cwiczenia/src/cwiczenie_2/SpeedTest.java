package cwiczenie_2;

import java.util.Scanner;
import static java.lang.String.valueOf;

public class SpeedTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Speed[] speeds = Speed.values();

        System.out.println("Dostępne prędkości:");
        for (Speed s : speeds) {
            System.out.println(s);
        }
        System.out.println("Wybierz prędkość:");
        String result = scanner.nextLine();
        Speed speed = Speed.valueOf(result);
        System.out.println("Poruszasz się z prędkością " + speed.name() + ", która wynosi " + speed.getHowSpeed());

        System.out.println("index w tablicy: " + speed.ordinal());
        System.out.println("nazwa w tablicy: " + speed.name());
    }
}
