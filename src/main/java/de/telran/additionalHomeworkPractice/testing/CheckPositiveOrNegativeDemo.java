package de.telran.testing;

import java.util.Scanner;

public class CheckPositiveOrNegativeDemo {
    public static void main(String[] args) {
        CheckPositiveOrNegative checkPositiveOrNegative = new CheckPositiveOrNegative();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean checkResult = checkPositiveOrNegative.isPositive(num);

        if(checkResult){
            System.out.println("Your entered positive number");
        }   else {
            System.out.println("Your entered negative number");
        }
    }
}
