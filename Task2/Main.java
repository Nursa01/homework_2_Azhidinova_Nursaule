package Task2;

public class Main {
    public static void main(String[] args) {
        Bank<Account> bank = new Bank<>();
        DepositAccount depositAccount = new DepositAccount("DA123", "Alice", 18000.0);
        TransitAccount transitAccount = new TransitAccount("TA456", "Bob", 50000.0);
        ClosedAccount closedAccount = new ClosedAccount("CA789", "Charlie", 22000.0);

        bank.addAccount(depositAccount);
        bank.addAccount(transitAccount);
        bank.addAccount(closedAccount);

        bank.showAccountsInfo();
    }
}
