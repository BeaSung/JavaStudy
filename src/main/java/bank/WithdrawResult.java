package bank;

public class WithdrawResult {
    private final long afterBalance;  // 출금 후 잔액
    private final long withdrawMoney;  // 출금 하려는 금액

    public WithdrawResult(long afterBalance, long withdrawMoney) {
        this.afterBalance = afterBalance;
        this.withdrawMoney = withdrawMoney;
    }

    @Override
    public String toString() {
        return "WithdrawResult{" +
                "afterBalance=" + afterBalance +
                ", withdrawMoney=" + withdrawMoney +
                '}';
    }
}
