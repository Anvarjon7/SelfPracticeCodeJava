package de.telran.javaPro_lessonPracticCode.module1.lesson3.statics;

public class Sim {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka");
        System.out.println(cat1.name + " -> "+cat1.countCats);
        Cat cat2 = new Cat("Barsik");
        System.out.println(cat2.name + " -> "+cat2.countCats);

        System.out.println(Cat.countCats);
        Cat.inc(); //static
        //inc(null);
        System.out.println(Cat.countCats);

        cat1.setAge(2); //include method
        //setAge(cat1,2); // this = cat1;

        System.out.println(Cat.COUNT_EARS);
    }
}
