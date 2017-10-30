package pl.notify.sender;

import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

@Component
public class EMAILNotificationSender implements NotificationSender {

    public void send(Notification notification) {
        System.out.println("Email wysłano na adres: " + notification.getEmail());
    }

}
