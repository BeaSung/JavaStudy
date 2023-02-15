package bank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private final String no;
    private final String name;
    private long balance;
    private final List<TransactionHistory> transactionHistories;

    // 고객이 계좌를 처음 만들때 사용하는 생성자
    public Account(String no, String name) {
        this.no = no;
        this.name = name;
        this.balance = 0L;
        this.transactionHistories = new ArrayList<>();
    }

    // 고객이 계좌를 조회할때 사용하는 생성자
    public Account(String no, String name, long balance, List<TransactionHistory> transactionHistories) {
        this.no = no;
        this.name = name;
        this.balance = balance;
        this.transactionHistories = transactionHistories;
    }

    public String getNo() {
        return no;
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
        withdraw(money);
        account.deposit(money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(no, account.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }

    @Override
    public String toString() {
        return "Account{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transactionHistories=" + transactionHistories +
                '}';
    }
}
