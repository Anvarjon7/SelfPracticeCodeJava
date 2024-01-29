package de.telran.javaPro_lessonPracticCode.module1.lesson2.abstract1;

public class Rino extends Animal{
    int sizeRog;

    @Override
    protected void voice() {
        System.out.println("Орет!");
    }

    @Override
    protected void run() {
        System.out.println("Громко топчет!");
    }

}
