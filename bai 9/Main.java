public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(50, 0.05);

        savings.deposit(10);
        System.out.println("Balance after deposit: " + savings.getBalance());

        savings.withdraw(20);
        System.out.println("Balance after withdrawal: " + savings.getBalance());

        savings.withdraw(40);
        System.out.println("Balance after withdrawal attempt: " + savings.getBalance());

        savings.monthlyProcess();
        System.out.println("Balance after monthly process: " + savings.getBalance());
    }
}
