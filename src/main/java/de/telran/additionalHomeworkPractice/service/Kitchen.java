package de.telran.service;

import java.util.Random;

public class Kitchen {

    public void dry() {
        System.out.println("Cooking");
    }

    public int timeToTheEndCooking(){

        Random random = new Random();
        int time = random.nextInt(50);
        return time;

    }

}
