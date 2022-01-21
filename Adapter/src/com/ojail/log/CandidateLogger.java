package com.ojail.log;

import com.ojail.print.Printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CandidateLogger implements BestLogger{

    private final Printer printer;
    public CandidateLogger(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void log(String str, Date date) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/outputBest.txt", false);
            fw.write(str + "\ncreated at: " + date);
        }catch (IOException e){
            printer.printMissingFile(e.toString(), true);
        }finally {
            if( fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    printer.printMissingFile(e.toString(), true);
                }
            }
            printer.printLog(true, str + "\n\t created at: " + date);
        }
    }
}
