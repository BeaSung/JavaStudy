package bank;

import java.util.Set;

public class Bank {
    private final Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public void createAccount(Account account) {
        boolean successful = this.accounts.add(account);
        if (!successful) {
            throw new IllegalArgumentException("동일한 계좌번호가 이미 등록되어 있습니다.");
        }
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
