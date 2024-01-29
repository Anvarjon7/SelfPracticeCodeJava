package de.telran.javaPro_lessonPracticCode.module1.lesson1;

public class Cat {
    public String name;
    private int weight;
    private int age;
    private boolean sterilized;

    public boolean isSterilized() {
        if(age > 2) {
            return sterilized;
        }
        return false;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        }
        else System.out.println("Ошибочный параметр");
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else System.out.println("Ошибочный параметр");
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        if(age > 0) {
            this.age = age;
        }
        else System.out.println("Ошибочный параметр");
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    void sayMeow() {
        System.out.println(name+" сказал МяУ!!! вес - "+weight+", возраст - "+age);
    }

    void sleep() {
        System.out.println(name+" сплю, не мешай!" );
    }

    void eat() {
        System.out.println(name+" ем, ррррр!" );
    }
}
