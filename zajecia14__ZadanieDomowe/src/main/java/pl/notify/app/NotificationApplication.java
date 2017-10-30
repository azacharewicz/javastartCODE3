package pl.notify.app;

import pl.notify.logger.FileLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.ConsoleReader;
import pl.notify.reader.NotificationReader;
import pl.notify.sender.NotificationSender;
import pl.notify.sender.SMSNotificationSender;
import java.io.IOException;


public class NotificationApplication {
    public static void main(String[] args) {
        NotificationReader reader = new ConsoleReader();
        NotificationSender sender = new SMSNotificationSender();
        NotifyLogger logger = new FileLogger();

        NotificationFacade facade = new NotificationFacade(reader, sender, logger);
        try {
            facade.sendNotifications();
        } catch (IOException e) {
            System.err.println("Wysłanie powiadomień zakończyło się niepowodzeniem!");
        }
    }
}
