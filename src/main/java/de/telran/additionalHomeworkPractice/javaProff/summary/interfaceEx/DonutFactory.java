package de.telran.javaProff.summary.interfaceEx;

public class DonutFactory {
    public Donut getInstance(DonutType type){
        Donut returnDonut = null;
        switch (type){
            case CHERRY:
                returnDonut = new CherryDonut();
                break;
            case CHOCOLATE:
                returnDonut = new ChocolateDonut();
                break;
            case CARAMEL:
                returnDonut = new CaramelDonut();
                break;
        }
        return returnDonut;
    }
}
