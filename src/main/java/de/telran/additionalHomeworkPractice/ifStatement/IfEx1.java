package de.telran.ifStatement;

import de.telran.staticExample.userInterface.Userinput;

public class IfEx1 {
    public static void main(String[] args) {
        Userinput ui = new Userinput();

        System.out.println("enter int number: ");

        int inputNum = ui.userInput();

        if (inputNum > 0) {
            System.out.println("true");
        }else if (inputNum < 0){
            System.out.println("false");
        }else  {
            System.out.println("equals");
        }
    }

}
