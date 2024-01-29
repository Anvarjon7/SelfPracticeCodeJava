package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public class WashMachine implements RemoteRelation,IosApp{
    @Override
    public void switchOn() {
        System.out.println("WashMashine включился");
    }

    @Override
    public void switchOff() {
        System.out.println("WashMashine выключился");
    }

    @Override
    public void switchProgram() {
        System.out.println("WashMashine переключила режим стирки");
    }

    @Override
    public void install() {
        System.out.println("Я умею инсталиться только через WEB");
    }

    @Override
    public void verifyAppStore() {
        System.out.println("Для стиралки АppStore всегда дает добро! )");
    }
}
