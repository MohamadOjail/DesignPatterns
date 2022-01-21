package com.ojail.commandPattern;

public class VowelsToWhitespace implements Command {

    @Override
    public String process(String string) {

        char[] output = string.toCharArray();

        for ( int i = 0; i < output.length; i++) {
            output[i] = VowelChecker.getInstance().isVowel(output[i]) ? ' ' : output[i];
        }

        return new String(output);
    }
}
