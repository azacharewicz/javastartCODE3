package producers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * Created by slawekludw on 05/10/2017.
 */
public class FileTextProducer implements Producer {
    @Override
    public String getText() {
        Optional<String> textFromFile = Optional.empty();
        try {
            textFromFile = Files
                    .readAllLines(Paths.get("plik.txt"), Charset.forName("UTF-8"))
                    .stream().reduce((a, b) -> a+b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textFromFile.orElse(null);
    }
}
