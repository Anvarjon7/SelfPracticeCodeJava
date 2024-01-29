package de.telran.javaPro_lessonPracticCode.module1.lesson2.interface1;

public class SimpleInterFace {
    public static void main(String[] args) {
        TV tv = new TV();
        CafeMachine cafeMashine = new CafeMachine();
        WashMachine washMashine = new WashMachine();

        RemoteRelation rr = new TV();

        AndroidApp androidApp = new CafeMachine();
        androidApp.install();
        RemoteRelation remoteRelation = new CafeMachine();

        IosApp iosApp = new WashMachine();

        myMethod(new CafeMachine(),  new WashMachine());

    }

    static void myMethod(RemoteRelation remoteRelation, IosApp iosApp) {
        remoteRelation.switchProgram();
        System.out.println(iosApp.sum(3,7,19));

    }
}
