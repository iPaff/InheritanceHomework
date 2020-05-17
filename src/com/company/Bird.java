package com.company;

public class Bird extends Animal {
    private int wings;

    public Bird(String color, String name, int wings) {
        super(color, name);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }
}
