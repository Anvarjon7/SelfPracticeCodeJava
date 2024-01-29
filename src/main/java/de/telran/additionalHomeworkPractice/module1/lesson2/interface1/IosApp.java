package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public interface IosApp extends App{
    void verifyAppStore(); // проверка магазином приложений

    default int sum(int a, int b) {
        return sumAll(a,b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a,b,c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int val: values) {
            result += val;
        }
        return result;
    }
}
