package pl.notify.reader;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Primary
public class ConsoleReader implements NotificationReader {

    public List<Notification> getNotifications() throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<Notification> notifications = new ArrayList<>();

        System.out.println("Napisz NEXT aby dodać kolejne powiadomienie albo EXIT aby zakończyć działanie");
        while (scanner.nextLine().equals("NEXT")) {
            System.out.println("Wpisz nazwę użytkownika");
            String username = scanner.nextLine();
            System.out.println("Wpisz email");
            String email = scanner.nextLine();
            System.out.println("Wpisz nr telefonu");
            String telephone = scanner.nextLine();
            System.out.println("Wpisz treść do wysyłki");
            String content = scanner.nextLine();
            notifications.add(new Notification(username, email, telephone, content));
            System.out.println("Napisz NEXT aby dodać kolejne powiadomienie albo EXIT aby zakończyć działanie");
        }
        scanner.close();
        return notifications;
    }

}