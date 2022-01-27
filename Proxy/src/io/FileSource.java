package io;

public enum FileSource {

    ADJECTIVES("data/adjectives.csv"),
    BAD("data/badWords.csv"),
    NAMES("data/names.csv");

    final String path;

    FileSource(String s) {
        this.path=s;
    }
}
