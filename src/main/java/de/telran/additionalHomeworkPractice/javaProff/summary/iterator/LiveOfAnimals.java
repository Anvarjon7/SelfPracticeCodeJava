package de.telran.javaProff.summary.iterator;

public class LiveOfAnimals {
    public static void main(String[] args) {
        long start = 10_000_000;
        int days = 10 * 365;
        for (int i = 0; i <= days; i++) {
            start = start + 14 - 8;
            if (i % 365 == 0)
                    System.out.println("Сейчас живёт в Лимпопо -->> " + start);
        }
    }
}
