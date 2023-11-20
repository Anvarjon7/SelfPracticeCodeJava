package de.telran.calculatorCode;

public class CalculatorDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;

        Calculator calc = new Calculator();
        int resultOfSum = calc.sum(x, y);
        System.out.println(resultOfSum);

        int resultOfSub = calc.sub(x, y);
        System.out.println(resultOfSub);

        int resultOfMult = calc.mult(x, y);
        System.out.println(resultOfMult);

        int resultOfDiv = calc.div(x, y);
        System.out.println(resultOfDiv);

    }
}
