package de.telran.stringCode;

import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {

        String myName = "Anvarjon";
        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();


        System.out.println("My name is " + userName + "!");
    }

}
