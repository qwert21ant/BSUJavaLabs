package ru.qwert21.labs.task1;

public class Main {
    public static void main(String[] args) {
        Text txt = new Text();

        Sentence sentence = new Sentence();
        txt.append(sentence);

        sentence.set("Some sentence");
        txt.append(sentence);
        txt.append(sentence);

        Word word = new Word("with");
        sentence.append(word);

        word.set("word");
        sentence.append(word);

        txt.append(sentence);

        txt.setTitle("Some title");

        System.out.println(txt);
        System.out.println();

        Word a = new Word("a");
        Word b = new Word("b");

        System.out.format("a == b: %b%n", a == b);
        System.out.format("a.equals(b): %b%n%n", a.equals(b));

        b.set("a");

        System.out.format("a == b: %b%n", a == b);
        System.out.format("a.equals(b): %b%n", a.equals(b));
    }
}
