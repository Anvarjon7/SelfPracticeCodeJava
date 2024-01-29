package de.telran.javaPro_lessonPracticCode.module1.lesson2.polymorph;

public class GroomerShop {
    public void cut(Animal animal) {
        System.out.print("Подстригли, животное сказало Спасибо - ");
        animal.voice();
    }


    public void cutClaws(Cat cat) {
        System.out.print("Подстригли когти, животное сказало Спасибо - ");
        cat.krups();
    }

    public int sum (Animal animal) {
        return 10;
    }

    public int sum (Dog dog) {
        return 20;
    }

    public int sum (Dog dog, Cat cat) {
        return 15;
    }
}
