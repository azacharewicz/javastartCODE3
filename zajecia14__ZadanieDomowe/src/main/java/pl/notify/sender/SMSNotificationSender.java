package pl.notify.sender;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.notify.model.Notification;

@Component
@Primary
public class SMSNotificationSender implements NotificationSender {

    public void send(Notification notification) {
        System.out.println("SMS wysłano na nr " + notification.getTelephone());
    }
}
