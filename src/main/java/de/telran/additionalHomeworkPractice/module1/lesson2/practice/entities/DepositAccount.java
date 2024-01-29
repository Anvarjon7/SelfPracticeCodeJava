package de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.entities;

import de.telran.javaPro_lessonPracticCode.module1.lesson2.practice.interfaces.AdminDeposit;

import java.time.LocalDate;

public class DepositAccount extends ClientAccount implements AdminDeposit {

    private double maxDeposit;

    public DepositAccount(double maxDeposit, String accountOwner, String accountNumber) {
        this.maxDeposit = maxDeposit;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.status = "opened";
        this.openDate = "today";
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getMaxDeposit() {
        return maxDeposit;
    }

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
            System.out.println("Your balance has been changed");
        } else {
            System.out.println("You try to withdraw more as you have");
        }
    }
    @Override
    public void deposit(double sum) {
        if (sum <= maxDeposit) {
            balance += sum;
            System.out.println("Your balance has been changed");
        } else {
            System.out.println("You try to deposit more as allowed");
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
