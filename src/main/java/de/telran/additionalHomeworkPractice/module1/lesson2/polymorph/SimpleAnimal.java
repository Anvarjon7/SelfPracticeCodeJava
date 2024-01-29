package de.telran.javaPro_lessonPracticCode.module1.lesson2.polymorph;

public class SimpleAnimal {
    public static void main(String[] args) {
        GroomerShop groomerShop = new GroomerShop();

        Animal animal = new Animal();
        animal.voice();
        groomerShop.cut(animal);

        //  При этом поведение объектов будет разным в зависимости от типа, к которому они принадлежат.
        animal = new Dog();
        animal.voice();
        groomerShop.cut(animal);


        animal = new Cat();
        animal.voice();
        groomerShop.cut(animal);

        groomerShop.cut(new Cat());

        HomeCat homeCat = new HomeCat();
        Animal animal1 = new HomeCat();
        groomerShop.cut(homeCat);

        groomerShop.cut(animal1);
        animal1 = homeCat;

        System.out.println(groomerShop.sum(new Dog()));
        System.out.println(groomerShop.sum(new Cat()));
        System.out.println(groomerShop.sum(new Dog(), new Cat()));
        // не перегрузка
        //System.out.println(groomerShop.sum(new Cat(), new Dog()));

    }
}
