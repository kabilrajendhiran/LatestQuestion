package com.company.demo;

public class WordCountModel {
    private String word;
    private int count;

    public WordCountModel(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WordCountModel{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
