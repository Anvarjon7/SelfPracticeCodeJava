package de.telran.javaPro_lessonPracticCode.module1.singleton;

public enum GateEnum {
    INSTANCE(250);
    private double radioGerz;

    GateEnum(double radioGerz) {
        this.radioGerz = radioGerz;
    }

    public void openGate(){
        System.out.println("Двери открываются ->"+radioGerz);
    }
    public void closeGate(){
        System.out.println("Двери закрываются ->"+radioGerz);
    }

}
