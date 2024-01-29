package de.telran.javaPro_lessonPracticCode.module1.lesson3.enums;

public class ScholarSchedule {
    private DayOfWeekE dayOfWeek;

    public DayOfWeekE getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeekE dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public ScholarSchedule(DayOfWeekE dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public boolean isWeekend() {
        boolean isWeekend = false;
        switch (dayOfWeek) {
            case SUNDAY:
            case SATURDAY:
                isWeekend = true;
        }
        return isWeekend;
    }
}
