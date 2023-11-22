package de.telran.additionalHomeworkPractice;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota",2023,"SkyBlue");


        String carModel = car.getModel();
        String carColor = car.getColor();
        int year = car.getYear();
        System.out.println("Model of car:" + carModel + " >> Color of Car: " + carColor + " >> Year: " + year + " ");
    }
}
