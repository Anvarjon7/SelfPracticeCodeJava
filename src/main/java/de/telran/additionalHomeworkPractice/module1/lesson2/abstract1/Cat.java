package de.telran.javaPro_lessonPracticCode.module1.lesson2.abstract1;

public class Cat extends Animal{
    String name;

    @Override
    protected void voice() {
        System.out.println("Мяу");
    }

    @Override
    protected void run() {
        System.out.println("Лапками быстро");
    }
}
