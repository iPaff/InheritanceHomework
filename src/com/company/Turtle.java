package com.company;

public class Turtle extends Animal {
    private int legs;
    private int tail;

    public Turtle(String color, String name, int legs, int tail) {
        super(color, name);
        this.legs = legs;
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
