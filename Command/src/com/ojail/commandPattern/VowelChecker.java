package com.ojail.commandPattern;

import java.util.HashMap;

public class VowelChecker {

    private final HashMap<Character, Character> vowels;

    private static final VowelChecker instance = new VowelChecker();

    public static VowelChecker getInstance(){return instance;}


    private VowelChecker() {

        this.vowels = new HashMap<>();
        this.vowels.put('a', 'A');
        this.vowels.put('e', 'E');
        this.vowels.put('i', 'I');
        this.vowels.put('o', 'O');
        this.vowels.put('u', 'U');
        this.vowels.put('y', 'Y');
        this.vowels.put('å', 'Å');
        this.vowels.put('ä', 'Ä');
        this.vowels.put('ö', 'Ö');
    }

    public boolean isVowel (char c){
        return (this.vowels.containsKey(c) || this.vowels.containsValue(c));
    }
}
