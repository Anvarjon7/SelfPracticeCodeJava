package de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.interfaces;

import java.time.LocalDate;

public interface Owner extends Cashier{
    void closeAccount(LocalDate closingDate);
}
