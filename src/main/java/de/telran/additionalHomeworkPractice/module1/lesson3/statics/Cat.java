package de.telran.javaPro_lessonPracticCode.module1.lesson3.statics;

public class Cat {
    public String name;
    private int age;

    static int countCats;

    public static final int COUNT_EARS = 2;


    public Cat(String name) {
        this.name = name;
        countCats++;
        inc();
    }

    static void inc() {
        countCats++;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
