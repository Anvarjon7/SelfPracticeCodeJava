package de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.entities;

import de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.interfaces.Cashier;
import de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.interfaces.Owner;

public abstract class Account implements Cashier, Owner {
    protected String accountNumber;
    protected double balance;
    protected String status;
    protected String openDate;
    protected String closeDate;

    public double getBalance() {
        return balance;
    }

    public void setStatus(String status) {
        if (status.equals("opened") || status.equals("closed") || status.equals("frozen")){
            this.status = status;
        } else {
            System.out.println("Incorrect status, try again.");
        }
    }

    public void closeAccount(String closeDate) {
        if (balance == 0) {
            this.status = "closed";
            this.closeDate = closeDate;
            System.out.println("Your account is closed");
        } else {
            System.out.println("You can't close your account");
        }
    }
}
