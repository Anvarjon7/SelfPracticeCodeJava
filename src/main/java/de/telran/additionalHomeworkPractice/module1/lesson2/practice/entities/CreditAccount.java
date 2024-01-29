package de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.entities;

import de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.interfaces.AdminCredit;

import java.time.LocalDate;

public class CreditAccount extends ClientAccount implements AdminCredit {

    private double maxWithdraw;
    private double creditLimit;

    public CreditAccount(String accountOwner, String accountNumber, double maxWithdraw, double creditLimit) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.maxWithdraw = maxWithdraw;
        this.creditLimit = creditLimit;
        this.status = "opened";
        this.openDate = "today";
    }

    public double getMaxWithdraw() {
        return maxWithdraw;
    }

    public void setMaxWithdraw(double maxWithdraw) {
        this.maxWithdraw = maxWithdraw;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum <= maxWithdraw && balance - sum >= -creditLimit) {
            balance -= sum;
            System.out.println("You have successfully withdrawn money from your account!");
        } else {
            System.out.println("Operation declined");
        }
    }

    @Override
    public void deposit(double sum) {
        if (balance + sum <= 0) {
            balance += sum;
            System.out.println("Your balance has been successfully funded!");
        } else {
            System.out.println("Operation declined, your balance can't be greater than 0");
        }
    }

    @Override
    public void closeAccount(LocalDate closingDate) {

    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
