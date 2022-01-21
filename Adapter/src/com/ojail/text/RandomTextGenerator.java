package com.ojail.text;

import com.ojail.log.Logger;
import com.ojail.print.Printer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class RandomTextGenerator implements TextGenerator{
    Printer printer;
    private String createdText;
    private List<String> words = null;

    public RandomTextGenerator(Printer printer) {
        this.printer = printer;
        this.createdText = "";
        try {
            this.words = Files.readAllLines(Path.of("src/wordlist.txt"));
        } catch (IOException e) {
            printer.printMissingFile(e.toString(), true);
        }
    }

    @Override
    public void createString(int length, Logger logger) {
        createText( length );
        logger.log(this.createdText);
    }

    private void createText(int length){
        createdText = " ";
        Random rnd = new Random();
        for (int i = 0; i < length; i++){
            if ( i < length - 1){
                assert words != null;
                createdText += words.get(rnd.nextInt(words.size())) + " ";
            }else createdText += words.get(rnd.nextInt(words.size())) + ".";
        }
    }
}
