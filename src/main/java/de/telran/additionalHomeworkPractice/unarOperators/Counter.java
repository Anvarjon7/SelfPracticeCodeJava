package de.telran.unarOperators;

public class Counter {
    public static void main(String[] args) {
        CounterEx counter = new CounterEx(0);
        counter.increment();

        int resultOfincrement = counter.count;
        System.out.println(resultOfincrement);

    }
}
