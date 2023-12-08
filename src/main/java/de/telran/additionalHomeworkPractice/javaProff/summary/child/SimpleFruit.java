package de.telran.javaProff.summary.child;

import de.telran.javaProff.summary.child.Ananas;
import de.telran.javaProff.summary.child.Fruit;

public class SimpleFruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setColor("red");
        fruit.setSugar(25);
        fruit.setVitamin(new String[]{"A", "B", "C"});
        System.out.println(fruit);

        Ananas ananas = new Ananas();

        ananas.setColor("yellow");
        ananas.setSugar(12);
        ananas.setVitamin(new String[]{"A","B","C","D"});
        ananas.setCountry("Uzbekistan");
        System.out.println(ananas);
    }
}
