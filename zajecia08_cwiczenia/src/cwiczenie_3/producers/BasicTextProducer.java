package producers;

import producers.Producer;

/**
 * Created by slawekludw on 05/10/2017.
 */
public class BasicTextProducer implements Producer {

    @Override
    public String getText() {

        return "Tekst zapisany na sztywno";
    }
}
