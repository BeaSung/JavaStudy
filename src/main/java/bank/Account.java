package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String name;
    private long balance;
    private final List<TransactionHistory> transactionHistories;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
        this.transactionHistories = new ArrayList<>();
    }

    public Account(String name, long balance, List<TransactionHistory> transactionHistories) {
        this.name = name;
        this.balance = balance;
        this.transactionHistories = transactionHistories;
    }

    public long deposit(long money) {
        this.balance += money;
        transactionHistories.add(new TransactionHistory(LocalDateTime.now(), money, TransactionType.DEPOSIT));
        return this.balance;
    }

    public WithdrawResult withdraw(long money) {
        if (this.balance < money) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        this.balance -= money;
        transactionHistories.add(new TransactionHistory(LocalDateTime.now(), money, TransactionType.WITHDRAW));
        return new WithdrawResult(this.balance, money);
    }

    public void transfer(Account account, long money) {
        this.withdraw(money);
        account.deposit(money);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", transactionHistories=" + transactionHistories +
                '}';
    }
}
