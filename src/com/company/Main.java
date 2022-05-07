package com.company;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog();
    dog.setName("Bagira");
    dog.setColor("black");
    dog.setAge(1.5d);
        System.out.println("The dog name is "+ dog.getName());
        System.out.println("Its color is - " + dog.getColor());
        System.out.println("Its age is - " + dog.getAge() + " years");
    dog.barking();

    }

}
