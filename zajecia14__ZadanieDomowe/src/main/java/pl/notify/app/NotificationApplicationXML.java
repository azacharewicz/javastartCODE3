package pl.notify.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class NotificationApplicationXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        NotificationFacade facade = context.getBean(NotificationFacade.class);
        try {
            facade.sendNotifications();
        } catch (IOException e) {
            System.err.println("Wysłanie powiadomień zakończyło się niepowodzeniem!");
        }
    }
}
