package de.telran.javaProff.summary.interfaceEx;

public interface Donut {

    String addJam();
    default void eat(){
        System.out.println("We are eating donut with: " +addJam());
    }
}
