package data;

import io.FileSource;
import io.Reader;
import java.util.Random;

public class Builder {

    private final WordProxy wordProxy= new WordProxy();
    private final Random rnd = new Random();
    private final Reader reader = new Reader();

    private final String[] adjs = reader.getWords(FileSource.ADJECTIVES);
    private final String[] names = reader.getWords(FileSource.NAMES);

    private String name = "";
    private  String adj = "";

    public String buildString(){
        name = names[rnd.nextInt(names.length)];
        adj = adjs[rnd.nextInt(adjs.length)];

        return name + " is " + adj;
    }

    public String buildStringProxy(){
        name = names[rnd.nextInt(names.length)];
        adj = wordProxy.getRandomAdj();

        return name + " is " + adj;
    }
}
