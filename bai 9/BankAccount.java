public abstract class BankAccount {
    protected double balance;
    protected int depositsThisMonth;
    protected int withdrawalsThisMonth;
    protected double annualInterestRate;
    protected double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.depositsThisMonth = 0;
        this.withdrawalsThisMonth = 0;
        this.monthlyServiceCharges = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            depositsThisMonth++;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            withdrawalsThisMonth++;
        }
    }

    public void calcInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();
        withdrawalsThisMonth = 0;
        depositsThisMonth = 0;
        monthlyServiceCharges = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getDepositsThisMonth() {
        return depositsThisMonth;
    }

    public int getWithdrawalsThisMonth() {
        return withdrawalsThisMonth;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }
}
