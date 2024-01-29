package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public class CafeMachine implements RemoteRelation,AndroidApp{
    @Override
    public void switchOn() {
        System.out.println("CafeMashine включился");
    }

    @Override
    public void switchOff() {
        System.out.println("CafeMashine выключился");
    }

    @Override
    public void switchProgram() {
        System.out.println("CafeMashine выбрала напиток");
    }

    @Override
    public void install() {
        System.out.println("install Android "+FREE_PAY);
    }
}
