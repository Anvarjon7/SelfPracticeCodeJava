package de.telran.javaPro_lessonPracticCode.module1.lesson3.enums;

public class DayOfWeek {
    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    public static DayOfWeek MONDAY = new DayOfWeek("Понедельник");
    public static DayOfWeek TUESDAY = new DayOfWeek("Вторник");
    public static DayOfWeek WEDNESDAY = new DayOfWeek("Среда");
    public static DayOfWeek THURSDAY = new DayOfWeek("Четверг");
    public static DayOfWeek FRIDAY = new DayOfWeek("Пятница");
    public static DayOfWeek SATURDAY = new DayOfWeek("Суббота");
    public static DayOfWeek SUNDAY = new DayOfWeek("Воскресенье");


    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}
