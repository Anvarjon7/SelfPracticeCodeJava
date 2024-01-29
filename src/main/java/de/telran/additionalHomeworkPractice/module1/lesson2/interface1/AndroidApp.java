package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public interface AndroidApp extends App {
    int FREE_PAY = 0;
    int SALE = 1;
    @Override
    default String autorization() {
        return "Авторизация по умолчанию для Андроид";
    }
}
