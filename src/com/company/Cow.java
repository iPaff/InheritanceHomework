package com.company;

public class Cow extends Turtle {
    private int horn;

    public Cow(String color, String name, int legs, int tail, int horn) {
        super(color, name, legs, tail);
        this.horn = horn;
    }

    public int getHorn() {
        return horn;
    }
}
