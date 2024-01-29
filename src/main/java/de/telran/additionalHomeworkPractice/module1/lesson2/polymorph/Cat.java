package de.telran.javaPro_lessonPracticCode.module1.lesson2.polymorph;

public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("Мау");
    }

    public void voice(String sound) {
        System.out.println("Голос");
    }

    public void krups() {
        System.out.println("Царапаюсь!");
    }
}
