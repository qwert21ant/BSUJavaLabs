package ru.qwert21.labs.task1;

import java.util.Objects;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public void set(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word == null ? "" : word;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Word && Objects.equals(word, ((Word) obj).word);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(word);
    }
}
