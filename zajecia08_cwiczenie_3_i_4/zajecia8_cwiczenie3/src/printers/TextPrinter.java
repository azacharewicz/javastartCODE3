package printers;

import decorators.TextDecorator;
import producers.Producer;

/*
W tej klasie korzystamy z interfejsu Producer,
i mówimy tylko bardzo ogólnie co metoda print robi
bierze jakiś tekst (w tej klasie nas nie obchodzi skąd)
i go wyświetla.

Kluczowe jest to, że nie ma tutaj żadnego powiązania
z konkretną klasą (implementacją), wykorzystujemy tylko interfejs Producer i TextDecorator, więc zakładamy,
że spełniony będzie zdefiniowany w nich kontrakt, czyli obiekty, który przypiszemy do pola producer
będzie miało metodę getText(), a obiekt przypisany do pola textDecorator będzie miał metodę decorate(), które
działają już w jakiś okreslony sposób

 */
public class TextPrinter {

    private Producer producer;
    private TextDecorator textDecorator;

    public TextPrinter(Producer producer, TextDecorator textDecorator) {
        this.producer = producer;
        this.textDecorator = textDecorator;
    }

    public void print() {
        String text = producer.getText();
        String decoratedText = textDecorator.decorate(text);
        System.out.println(decoratedText);
    }

//    Jeśli zapisalibyśmy tak jak poniżej, to późniejsze zmiany wewnątrz metody print
//    wpłynęłyby najprawdopodobniej na kilka miejsc w naszej aplikacji, kod innych programistów
//    coś przestało by działać
//    public void print() {
//        System.out.println("Jakiś tekst wpisany na sztywno");
//    }
}
