package decorators;

/**
 * Created by slawekludw on 05/10/2017.
 */
public class UpperCaseDecorator implements TextDecorator {
    //ten dekorator zamienia tekst na wielkie litery
    @Override
    public String decorate(String text) {
        return text.toUpperCase();
    }
}
