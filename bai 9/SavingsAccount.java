class SavingsAccount extends BankAccount {
    private boolean status;  
 
    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        checkStatus();
    }
    private void checkStatus() {
        status = balance >= 25;
    }

    @Override
    public void withdraw(double amount) {
        checkStatus();
        if (status) {
            super.withdraw(amount);
            checkStatus();  
        } else {
            System.out.println("Withdrawal denied: Account is inactive.");
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        checkStatus();  
    }

    @Override
    public void monthlyProcess() {
        if (withdrawalsThisMonth > 4) {
            monthlyServiceCharges += (withdrawalsThisMonth - 4); 
        }
        super.monthlyProcess();
        checkStatus();
    }
}
