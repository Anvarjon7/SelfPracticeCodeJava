package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public interface App {
    void install();
    //возвращает пользователя
    default String autorization() {
        return "Я пользователь Noname";
    }
}
