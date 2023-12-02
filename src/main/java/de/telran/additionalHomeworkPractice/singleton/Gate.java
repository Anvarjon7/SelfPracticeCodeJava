package de.telran.javaPro_lessonPracticCode.module1.singleton;

public class Gate {
    private static Gate instance;
    private double radioGerz;
    public void openGate(){
        System.out.println("Двери открываются ->"+radioGerz);
    }
    public void closeGate(){
        System.out.println("Двери закрываются ->"+radioGerz);
    }

    private Gate(double radioGerz) {
        this.radioGerz = radioGerz;
    }
    public static Gate getInstance(double radioGerz){
        if (instance == null){
            instance = new Gate(radioGerz);
        }
        return instance;
    }

}
