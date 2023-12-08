package de.telran.javaProff.summary.interfaceEx;

public class DonutKiosk {
    public static void main(String[] args) {
        DonutFactory df = new DonutFactory();
        Donut donut = df.getInstance(DonutType.CHERRY);
        donut.eat();
        donut = df.getInstance(DonutType.CARAMEL);
        donut.eat();

        donut = StaticDonutFactory.getInstance(DonutType.CHOCOLATE);
        donut.eat();
        df.getInstance(DonutType.CARAMEL).eat();
        StaticDonutFactory.getInstance(DonutType.CHERRY).eat();

    }
}
