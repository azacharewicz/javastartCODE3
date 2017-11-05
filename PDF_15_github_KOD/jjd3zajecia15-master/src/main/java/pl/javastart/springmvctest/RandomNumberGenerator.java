package pl.javastart.springmvctest;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator {

    public int nextAge() {
        Random random = new Random();
        return 10 + random.nextInt(50);
    }
}
