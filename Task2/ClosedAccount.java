package Task2;

public class ClosedAccount extends Account{
    private double balance;
    public ClosedAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
