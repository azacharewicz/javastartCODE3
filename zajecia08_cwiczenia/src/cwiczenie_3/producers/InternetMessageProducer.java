package producers;

import producers.Producer;

/**
 * Created by slawekludw on 05/10/2017.
 */
public class InternetMessageProducer implements Producer {

    @Override
    public String getText() {
        return "Tutaj mógłby być tekst pobierany z internetu";
    }
}
