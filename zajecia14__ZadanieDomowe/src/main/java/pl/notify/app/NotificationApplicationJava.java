package pl.notify.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.notify.config.ApplicationConfig;
import java.io.IOException;

public class NotificationApplicationJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        NotificationFacade notificationFacade = context.getBean(NotificationFacade.class);
        try {
            notificationFacade.sendNotifications();
        } catch (IOException e) {
            System.err.println("Wysłanie powiadomień zakończyło się niepowodzeniem!");
        }
    }
}
