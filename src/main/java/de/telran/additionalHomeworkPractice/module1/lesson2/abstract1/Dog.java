package de.telran.javaPro_lessonPracticCode.module1.lesson2.abstract1;

public class Dog extends Animal{
    String name;

    @Override
    protected void voice() {
        System.out.println("Гав");
    }

    @Override
    protected void run() {
        System.out.println("Бегает четырьмя ногами :)");
    }
}
