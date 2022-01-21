package com.ojail.print;

public class Printer {

    private final Colors colors = new Colors();

    public void printSuccess(){
        String text = "\n\n\t" + colors.WHITE_BACKGROUND_BRIGHT + colors.RED_BOLD_BRIGHT + " SUCCESS! " + colors.RESET
                    + "\n\n\t" + colors.CYAN_BRIGHT + "Se filerna: " + colors.RESET
                    + colors.YELLOW_BOLD_BRIGHT + "output.txt " + colors.RESET
                    + "" + colors.CYAN_BRIGHT + "/ " + colors.RESET
                    + colors.YELLOW_BOLD_BRIGHT + "outputBest.txt " + colors.RESET
                    + "" + colors.CYAN_BRIGHT + "för resultaten." + colors.RESET
                    + "\n" + colors.GREEN + "\t=======================================================" + colors.RESET;
        System.out.println(text);

    }

    public void printMissingFile(String message, boolean customMessage){
        if(!customMessage) System.out.println( "\n\t" + colors.RED_BACKGROUND_BRIGHT + colors.WHITE_BOLD_BRIGHT + "  Missing File, exiting ...  " + colors.RESET);
        else System.out.println( "\n\t" + colors.RED_BACKGROUND_BRIGHT + colors.WHITE_BOLD_BRIGHT + " " + message + " " + colors.RESET);
    }

    public void printLog(boolean newLogger, String log){
        if(!newLogger){
            System.out.println("\t" + decorated(" ", " Log in file: (old logger)", log,false));
            System.out.println("\t" + log);
            System.out.println("\t" + decorated("=", "", log,true));
        }else {
            System.out.println("\t" + decorated(" ", " Log in file: (New logger)", log,false));
            System.out.println("\t" + log);
            System.out.println("\t" + decorated("=", "", log,true));
        }
    }
    private String decorated(String x, String text, String log, boolean footer){
        int length = 0;
        boolean hasNewline = log.lines().count() > 1;

        if (hasNewline){
            String[] lines = log.split("\\n");
            length = Math.max(lines[0].length(), lines[1].length());
        }else length = log.length();

        int spaceCount = length - text.length();

        return !footer ? "\n\t" + colors.BLACK_BACKGROUND
                       + colors.WHITE_BOLD_BRIGHT
                       + text + x.repeat(spaceCount)
                       + colors.RESET :
                         colors.CYAN_BRIGHT
                        + x.repeat(spaceCount)
                        + colors.RESET;
    }
}
