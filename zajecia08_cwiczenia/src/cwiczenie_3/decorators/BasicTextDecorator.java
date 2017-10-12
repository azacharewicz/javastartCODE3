package decorators;

/**
 * Created by slawekludw on 05/10/2017.
 */
public class BasicTextDecorator implements TextDecorator {

    //w tym przypadku jest to najprostsza implementacja TextDecoratora - nie robimy nic
    @Override
    public String decorate(String text) {
        return text;
    }
}
