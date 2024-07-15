package Task1;

public class Main {
    public static void main(String[] args) {

        Account[] accounts = {
                new Account("John", 3451),
                new Account("Jane", 3131),
                new Account("Jack", 4114),
                new Account("Jill", 8755),
                new Account("Max", 1433)
        };

        Compare.sort(accounts);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
