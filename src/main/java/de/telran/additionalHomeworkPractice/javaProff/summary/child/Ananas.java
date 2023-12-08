package de.telran.javaProff.summary.child;

import java.util.Arrays;

public class Ananas extends Fruit {

    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ananas{" +
                "color='" + getColor() + '\'' +
                ", sugar=" + getSugar() +
                ", vitamin=" + Arrays.toString(getVitamin()) +
                "country='" + country + '\'' +
                '}';
    }
}
