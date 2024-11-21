package com.example.wear;

public class WiseSaying {

    private final int number;
    private final String content;
    private final String author;

    public WiseSaying(int number, String content, String author) {
        this.number = number;
        this.content = content;
        this.author = author;
    }

    public String format() {
        return String.format("%d / %s / %s", number, author, content);
    }

}
