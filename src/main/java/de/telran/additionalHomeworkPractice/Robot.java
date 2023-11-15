package de.telran.additionalHomeworkPractice;

public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Helloooo!");
    }

    public Robot() {
    }

    public void sayYourName(){
        System.out.println("My name is " + name);
    }
}
