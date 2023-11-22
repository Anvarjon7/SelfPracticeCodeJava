package de.telran.switchStatement;

import de.telran.staticExample.userInterface.Userinput;

public class SwitchExample {
    public static void main(String[] args) {
        Userinput ui = new Userinput();
        int userInt;
        double userDouble;
        String text;
        System.out.println("Menu: ");
        System.out.println("1. Integer");
        System.out.println("2. Double ");
        System.out.println("3. Text ");
        System.out.println("Please make your choice: ");
        int userChoice = ui.userInput();

        switch (userChoice){
            case 1:
                System.out.println("Please enter integer number: ");
                userInt = ui.userInput();
                break;
            case 2:
                System.out.println("Please enter double number: ");
                userDouble = ui.userDouble();
                break;
            case 3:
                System.out.println("Please enter text: ");
                text = ui.userText();
                break;
            default:
                System.out.println("Wrong choice!!!");
        }
    }
}
