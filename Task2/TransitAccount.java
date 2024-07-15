package Task2;

public class TransitAccount extends Account{
    public TransitAccount(String name, String id, double balance) {
        super(name, id, balance);
    }
    @Override
    public String toString() {
        return "TransitAccount{" + super.toString() + '}';
    }
}
