package data;

import io.FileSource;
import io.Reader;

import static java.util.Arrays.*;

public class WordProxy {

    private final Reader reader = new Reader();
    private final Builder builder = new Builder();
    private final String[] badWords = reader.getWords(FileSource.BAD);

    public String buildStringProxy(){

        String output = builder.buildString();
        while (containsUnwanted(output)) output = builder.buildString();
        return output;
    }

    public boolean containsUnwanted(String sentence){
        return stream(badWords).anyMatch(bad -> bad.equalsIgnoreCase(sentence.split(" ")[2]));
    }
}
