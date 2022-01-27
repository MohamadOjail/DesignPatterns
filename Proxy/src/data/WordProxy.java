package data;

import io.FileSource;
import io.Reader;
import java.util.Random;

import static java.util.Arrays.*;

public class WordProxy {

    private final Random rnd = new Random();
    private final Reader reader = new Reader();
    private final String[] badWords = reader.getWords(FileSource.BAD);
    private final String[] adjs = reader.getWords(FileSource.ADJECTIVES);

    public String getRandomAdj(){

        String output = adjs[rnd.nextInt(adjs.length)];
        while (isUnwanted(output)){
            output = adjs[rnd.nextInt(adjs.length)];
        }
        return output;
    }

    public boolean isUnwanted(String adj){
        return stream(badWords).anyMatch(bad -> bad.equalsIgnoreCase(adj));
    }
}
