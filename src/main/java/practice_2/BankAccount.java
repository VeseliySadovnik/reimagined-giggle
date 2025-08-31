package practice_2;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String Owner, double Balance) {
        this.owner = Owner;
        this.balance = Balance;
    }
        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void printBalance() {
            System.out.println("Владелец: " + owner + ", баланс: " + balance + " руб. ");
        }

}
