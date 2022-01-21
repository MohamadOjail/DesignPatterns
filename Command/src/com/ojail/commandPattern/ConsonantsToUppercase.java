package com.ojail.commandPattern;

public class ConsonantsToUppercase implements Command{

    @Override
    public String process(String string) {
        char[] output = string.toCharArray();

        for ( int i = 0; i < output.length; i++) {
            output[i] = Character.isUpperCase(output[i]) ? output[i] : Character.toUpperCase(output[i]);
        }

        return new String(output);
    }
}
