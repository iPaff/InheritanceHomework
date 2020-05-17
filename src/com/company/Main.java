package com.company;

public class Main {

    public static void main(String[] args) {
	Animal ourAnimal = new Animal("Orange","Tiger");
        System.out.println(ourAnimal.getColor());
        System.out.println(ourAnimal.getName());
        System.out.println("***********************");
        Turtle ourAnimal2 = new Turtle("Green","Donatelo",4,1);
        System.out.println(ourAnimal2.getName());
        System.out.println(ourAnimal2.getColor());
        System.out.println("Our Animal has " + ourAnimal2.getTail() + " Tail");
        System.out.println("Our Animal has " + ourAnimal2.getLegs() + " Legs");
        System.out.println("***********************");
        Cow cow = new Cow("Lila","Milka",4,1,2);
        System.out.println("Our Cow is called " + cow.getName());
        System.out.println("Our Cow color is " + cow.getColor());
        System.out.println("Our Cow has " + cow.getLegs() + " Legs");
        System.out.println("Our Cow has " + cow.getTail() + " Tail");
        System.out.println("Our Cow has " + cow.getHorn());
        System.out.println("***********************");
        Bird bird = new Bird("Brown","Bald Eagle",2);
        System.out.println("Our Eagle color is " + bird.getColor());
        System.out.println("Our Eagle is called " + bird.getName());
        System.out.println("Our Eagle has " + bird.getWings() + " Wings" );
    }
}
