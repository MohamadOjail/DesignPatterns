package data;

import io.FileSource;
import io.Reader;
import java.util.Random;

public class Builder {

    private final Random rnd = new Random();
    private final Reader reader = new Reader();

    private final String[] adjectives = reader.getWords(FileSource.ADJECTIVES);
    private final String[] names = reader.getWords(FileSource.NAMES);

    public String buildString(){
        String name = names[rnd.nextInt(names.length)];
        String adjective = adjectives[rnd.nextInt(adjectives.length)];

        return name + " is " + adjective;
    }
}
