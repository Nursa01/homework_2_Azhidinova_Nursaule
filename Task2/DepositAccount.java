package Task2;

public class DepositAccount extends Account {
    private double balance;
    public DepositAccount(String name, String id, double balance) {
        super(name, id);
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
