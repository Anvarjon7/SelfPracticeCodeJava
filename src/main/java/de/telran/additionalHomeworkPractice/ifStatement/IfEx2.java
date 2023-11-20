package de.telran.ifStatement;

import de.telran.staticExample.userInterface.Userinput;

public class IfEx2 {
    public static void main(String[] args) {
        Userinput ui = new Userinput();

        System.out.println("Enter your number: ");
        int userInput = ui.userInput();

        int range10 = 10;
        int range100 = 100;
        int range1000 = 1000;

        int diff10 = Math.abs(userInput - range10);
        int diff100 = Math.abs(userInput - range100);
        int diff1000 = Math.abs(userInput - range1000);

        if (diff10 < diff100) {
            System.out.println("ближе 10");
        }else if (diff100 < diff1000) {
            System.out.println("ближе 100");
        }else {
            System.out.println("ближе 1000");
        }
    }
}
