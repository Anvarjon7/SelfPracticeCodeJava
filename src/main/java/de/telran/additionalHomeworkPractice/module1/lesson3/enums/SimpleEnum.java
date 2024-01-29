package de.telran.javaPro_lessonPracticCode.module1.lesson3.enums;

import java.util.Arrays;

public class SimpleEnum {
    public static void main(String[] args) {
//        DayOfWeek day1 = new DayOfWeek("понедельник");
//        System.out.println(day1);
//
//        DayOfWeek day2 = new DayOfWeek("fdghghfjgj");
//        System.out.println(day2);

        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.TUESDAY;

        DayOfWeekE day5 = DayOfWeekE.FRIDAY;

        ScholarSchedule scholarSchedule = new ScholarSchedule(DayOfWeekE.MONDAY);

        if(scholarSchedule.getDayOfWeek() == DayOfWeekE.SUNDAY) {
            System.out.println("Ура, сегодня выходной!");
        }
        else System.out.println("Опять в школу :(");


        if(scholarSchedule.isWeekend()) {
            System.out.println("Ура, сегодня выходной!");
        }
        else System.out.println("Опять в школу :(");

        if(day5 == DayOfWeekE.FRIDAY) {
            System.out.println("Ура, сегодня выходной!");
        }
        else System.out.println("Опять в школу :(");

        System.out.println(day5.getTitle());
        System.out.println(DayOfWeekE.SUNDAY.getTitle());

        System.out.println(day5);
        System.out.println(DayOfWeekE.SUNDAY);
        System.out.println(Arrays.toString(DayOfWeekE.values()));
        System.out.println(DayOfWeekE.values());

        System.out.println(day5.ordinal());
        System.out.println(DayOfWeekE.SUNDAY.ordinal());

        System.out.println(DayOfWeekE.valueOf("SUNDAY"));
//        System.out.println(DayOfWeekE.valueOf("qwretqreyt"));

    }
}
