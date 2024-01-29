package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public class TV implements RemoteRelation,App{
    @Override
    public void switchOn() {
        System.out.println("Телевизор включился");
    }

    @Override
    public void switchOff() {
        System.out.println("Телевизор выключился");
    }

    @Override
    public void switchProgram() {
        System.out.println("Телевизор переключил канал");
    }

    @Override
    public void install() {
        System.out.println("Я могу инсталлироваться для обслуживания ТВ");
    }

    @Override
    public String autorization() {
        // взять юзера из Андроид ТВ
        return "Я пользователь Вася, взять с Андроид ТВ";
    }
}
