package de.telran.javaPro_lessonPracticCode.module1.lesson3.enums;

public enum DayOfWeekE {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String title;

    DayOfWeekE(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeekE{" +
                "title='" + title + '\'' +
                "} " + super.toString();
    }
}
