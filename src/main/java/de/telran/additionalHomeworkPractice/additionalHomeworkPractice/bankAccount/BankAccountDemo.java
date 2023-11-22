package de.telran.additionalHomeworkPractice.bankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John","Smith",100000);

        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();
        int moneyAmount = bankAccount.getMoneyAmount();

        System.out.println("Owner information: " + ownerFirstName + " " + ownerLastName + " -->> Money Amount = " + moneyAmount);
    }
}
