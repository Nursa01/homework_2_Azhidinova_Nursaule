package Task2;

import java.util.ArrayList;
import java.util.List;

class Bank<T extends Account>{
    private List<T> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(T account) {
        accounts.add(account);
    }

    public void showAccountsInfo() {
        for (T account : accounts) {
            System.out.println(account);
        }
    }
}

