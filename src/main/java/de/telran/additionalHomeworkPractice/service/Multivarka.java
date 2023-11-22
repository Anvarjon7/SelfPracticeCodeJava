package de.telran.service;

public class Multivarka {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();

        kitchen.dry();

//        System.out.println(kitchen.timeToTheEndCooking());


        int endTime = kitchen.timeToTheEndCooking();
        System.out.println("Время завершения готовки: " + endTime);
    }
}
