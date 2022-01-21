package com.ojail.log;

import com.ojail.print.Printer;

import java.util.Date;

public class LoggerAdapter implements Logger{
    private final Printer printer;
    private final BestLogger bestLogger;
    private final Date date;

    public LoggerAdapter(Printer printer) {
        this.printer = printer;
        bestLogger = new CandidateLogger(printer);
        date = new Date();
    }

    @Override
    public void log(String str) {
        bestLogger.log(str, date);
    }
}
