package zadanie_1_1;

import java.util.Scanner;

public class DirectionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Direction[] directions = Direction.values();

        System.out.println("Kierunki geograficzne:");
        for (Direction d : directions) {
            System.out.println(d);
        }

        System.out.println("Wybierz kierunek, w którym chcesz iść:");
        String user_input = scanner.nextLine();
        System.out.println(user_input);

        Direction user_direction = Direction.valueOf(user_input);

        System.out.println("Ok, więc idziemy na " + user_direction.getDirectionName());
    }
}


//        System.out.println("Wybierz prędkość:");
//        String result = scanner.nextLine();
//        Speed speed = Speed.valueOf(result);
//        System.out.println("Poruszasz się z prędkością " + speed.name() + ", która wynosi " + speed.getHowSpeed());
//
//        System.out.println("index w tablicy: " + speed.ordinal());
//        System.out.println("nazwa w tablicy: " + speed.name());
//    }
//}
