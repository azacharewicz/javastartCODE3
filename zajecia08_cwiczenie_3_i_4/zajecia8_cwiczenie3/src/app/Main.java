package app;

import decorators.BasicTextDecorator;
import decorators.TextDecorator;
import decorators.UpperCaseDecorator;
import producers.BasicTextProducer;
import printers.TextPrinter;
import producers.FileTextProducer;
import producers.Producer;

//W przyszłości dowiemy się, ze przedstawiona tutaj koncepcja jest wzorcem projektowym
//nazywanym wstrzykiwaniem zależności
public class Main {
    public static void main(String[] args) {
        //sami wybieramy skąd będzie brany tekst do wyświetlenia
        Producer prod = new BasicTextProducer();
        TextDecorator decorator1 = new BasicTextDecorator();
        TextPrinter printer = new TextPrinter(prod, decorator1);
        printer.print();

        //ale możemy równie dobrze wczytać z plik.txt, a tekst wyświetlić wielkimi literami
        Producer fileProducer = new FileTextProducer();
        TextDecorator decorator2 = new UpperCaseDecorator();
        TextPrinter printer2 = new TextPrinter(fileProducer, decorator2);
        printer2.print();
    }
}
