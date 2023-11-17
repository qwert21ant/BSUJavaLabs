package ru.qwert21.labs.task1;

import java.util.Objects;

public class Sentence {
    private String sentence;

    public Sentence() {
        this.sentence = "";
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void set(String sentence) {
        this.sentence = sentence;
    }

    public void append(String str) {
        sentence += " " + str;
    }

    public void append(Word str) {
        sentence += " " + str;
    }

    @Override
    public String toString() {
        if (sentence != null && !sentence.isEmpty()) {
            return sentence + ".";
        }

        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Sentence && Objects.equals(sentence, ((Sentence) obj).sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sentence);
    }
}
