package J06DefiningClasses.Lab.P03BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int counter = 1;
    private int id;
    private double balance;

    public int getId() {
        return this.id;
    }

    public BankAccount() {
        this.id = counter;
        counter++;
        this.balance = 0;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }


    public void deposit (double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
}
