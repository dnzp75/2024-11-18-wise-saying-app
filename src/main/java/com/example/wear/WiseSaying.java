package com.example.wear;

public class WiseSaying {

    private final int id;
    private final String content;
    private final String author;

    public WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public String format() {
        return String.format("%d / %s / %s", id, author, content);
    }

    public boolean matchesId(int idToCompare) {
        return this.id == idToCompare;
    }
}
