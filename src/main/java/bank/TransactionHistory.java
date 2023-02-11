package bank;

import java.time.LocalDateTime;

public class TransactionHistory {
//    public static final String DEPOSIT_TYPE = "입금";
//    public static final String WITHDRAW_TYPE = "출금";
    // TransactionType 으로 변경

    private final LocalDateTime transactionDateTime;
    private final TransactionType transactionType;
    private final long money;

    public  TransactionHistory(LocalDateTime transactionDateTime, long money, TransactionType transactionType) {
        this.transactionDateTime = transactionDateTime;
        this.money = money;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "transactionDateTime=" + transactionDateTime +
                ", transactionType='" + transactionType + '\'' +
                ", money=" + money +
                '}';
    }
}
