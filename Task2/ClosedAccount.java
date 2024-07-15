package Task2;

public class ClosedAccount extends Account{
    public ClosedAccount(String name, String id, double balance) {
        super(name, id, balance);
    }
    @Override
    public String toString() {
        return "ClosedAccount{" + super.toString() + '}';
    }
}
