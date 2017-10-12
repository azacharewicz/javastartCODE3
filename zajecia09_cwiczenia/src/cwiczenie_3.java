import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class cwiczenie_3 {
    public static void main(String[] args) {

        File file = new File("plikAni.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }

    }
}
