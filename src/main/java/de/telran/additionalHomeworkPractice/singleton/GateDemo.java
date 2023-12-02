package de.telran.javaPro_lessonPracticCode.module1.singleton;

public class GateDemo {
    public static void main(String[] args) {
        Gate gate = Gate.getInstance(299);
        Gate gate1 = Gate.getInstance(333);
        System.out.println(gate == gate1);
        System.out.println(gate.equals(gate1));
        System.out.println(gate);
        System.out.println(gate1);

        System.out.println();

        GateEnum gateEnum = GateEnum.INSTANCE;
        GateEnum gateEnum1 = GateEnum.INSTANCE;
        System.out.println(gateEnum1 == gateEnum);
        System.out.println(gateEnum1);
        System.out.println(gateEnum);
    }
}
