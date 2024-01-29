package de.telran.javaPro_lessonPracticCode.module1.lesson1;

public class SimpleCatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Мурка";
        cat1.setWeight(1);
        cat1.setAge(2);
        cat1.sayMeow();

        Cat cat2 = new Cat("Барсик");
        cat2.sayMeow();

        Cat cat3 = new Cat("Васька", 3, 2);
        cat3.sayMeow();

        Cat cat4;
        cat4 = new Cat();
    }
}
