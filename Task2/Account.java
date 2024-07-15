package Task2;

public abstract class Account {
    private String accountName;
    private String accountId;
    private double balance;

    public Account(String accountName, String accountId, double balance) {
        this.accountName = accountName;
        this.accountId = accountId;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [accountName=" + accountName +
                ", accountId=" + accountId +
                ", balance=" + balance + "]";
    }
}
