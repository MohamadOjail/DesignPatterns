package com.ojail.log;

import com.ojail.print.Printer;

import java.io.FileWriter;
import java.io.IOException;

public class CurrentLogger implements Logger {
    private final Printer printer;
    public CurrentLogger(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void log(String str) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("src/output.txt", false);
            fw.write(str);
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
            printer.printLog(false, str);
        }
    }
}
