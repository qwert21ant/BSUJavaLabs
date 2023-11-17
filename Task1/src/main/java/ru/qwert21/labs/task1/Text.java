package ru.qwert21.labs.task1;

import java.util.Objects;

public class Text {
    private String title;
    private String text;

    public Text() {
        text = "";
    }

    public Text(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void append(String str) {
        text += " " + str;
    }

    public void append(Sentence str) {
        if (!text.isEmpty()) {
            text += " ";
        }

        text += str;
    }

    @Override
    public String toString() {
        if (title != null) {
            return title + "\n" + text;
        }
        return text == null ? "" : text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Text txt) {
            return Objects.equals(title, txt.title) && Objects.equals(text, txt.text);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }
}
