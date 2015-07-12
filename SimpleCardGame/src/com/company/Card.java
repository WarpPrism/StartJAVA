package com.company;

/**
 * Created by zhoujihao on 15-7-12.
 */
public class Card {

    private String type;
    private int value;

    Card() {}
    Card(String type_, int value_) {
        this.type = type_;
        this.value = value_;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
