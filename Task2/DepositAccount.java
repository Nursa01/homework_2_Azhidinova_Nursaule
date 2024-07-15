package Task2;

public class DepositAccount extends Account {
    public DepositAccount(String name, String id, double balance) {
        super(name, id, balance);
    }
    @Override
    public String toString() {
        return "DepositAccount{" + super.toString() + '}';
    }
}
