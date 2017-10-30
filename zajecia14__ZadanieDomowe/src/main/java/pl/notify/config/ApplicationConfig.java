package pl.notify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import pl.notify.app.NotificationFacade;
import pl.notify.logger.FileLogger;
import pl.notify.logger.NotifyLogger;
import pl.notify.reader.ConsoleReader;
import pl.notify.reader.FileNotificationReader;
import pl.notify.reader.NotificationReader;
import pl.notify.sender.EMAILNotificationSender;
import pl.notify.sender.NotificationSender;
import pl.notify.sender.SMSNotificationSender;

public class ApplicationConfig {

    @Bean
    public NotifyLogger logger() {
        FileLogger fileLogger = new FileLogger();
        return fileLogger;
    }

    @Bean
    public FileNotificationReader fileReader() {
        FileNotificationReader fileNotificationReader = new FileNotificationReader();
        return fileNotificationReader;
    }

    @Bean
    @Primary
    public ConsoleReader consoleReader() {
        ConsoleReader consoleNotificationReader = new ConsoleReader();
        return consoleNotificationReader;
    }

    @Bean
    public EMAILNotificationSender emailSender() {
        EMAILNotificationSender EMAILNotificationSender = new EMAILNotificationSender();
        return EMAILNotificationSender;
    }

    @Bean
    @Primary
    public SMSNotificationSender smsSender() {
        SMSNotificationSender SMSNotificationSender = new SMSNotificationSender();
        return SMSNotificationSender;
    }


    @Bean
    public NotificationFacade facade(NotifyLogger logger, NotificationReader reader, NotificationSender sender) {
        NotificationFacade notificationFacade = new NotificationFacade(reader, sender, logger);
        return notificationFacade;
    }
}
