package de.telran.javaProff.summary.child;

import java.util.Arrays;

public class Fruit {
    private String color;
    private int sugar;
    private String[] vitamin;

    protected String getColor() {
        return color;
    }

    public int getSugar() {
        return sugar;
    }

    public String[] getVitamin() {
        return vitamin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setVitamin(String[] vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", sugar=" + sugar +
                ", vitamin=" + Arrays.toString(vitamin) +
                '}';
    }
}
