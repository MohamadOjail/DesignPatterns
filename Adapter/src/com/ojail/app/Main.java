package com.ojail.app;

import com.ojail.log.CurrentLogger;
import com.ojail.log.Logger;
import com.ojail.log.LoggerAdapter;
import com.ojail.print.Printer;
import com.ojail.text.RandomTextGenerator;
import com.ojail.text.TextGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args){

        Printer printer = new Printer();

        if ( !Files.exists(Path.of("src/wordlist.txt"))) {
            printer.printMissingFile("", false);
            System.exit(0);
        }

        Logger currentLogger = new CurrentLogger(printer);
        Logger loggerAdapter = new LoggerAdapter(printer);
        TextGenerator textGenerator = new RandomTextGenerator(printer);

        try {
            textGenerator.createString( 4, currentLogger);
        }catch (Exception e){
            printer.printMissingFile(e.toString(), true);
        }

        try {
            textGenerator.createString( 4, loggerAdapter);
        }catch (Exception e){
            printer.printMissingFile(e.toString(), true);
            System.exit(0);
        }

        printer.printSuccess();
    }
}
