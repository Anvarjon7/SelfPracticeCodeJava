package de.telran.catCode;

public class CatDemo {
    public static void main(String[] args) {
        Cat newCat = new Cat("Mura", 4, "breed");
        System.out.println("Cat name: " + newCat.name + ", Age: " + newCat.age + ", Breed: " + newCat.breed);
    }
}
