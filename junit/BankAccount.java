public class BankAccount {

    private Integer balance;

    // Create a constructor
    public BankAccount(Integer balance) {
        this.balance = balance;
    }

    // Add method to calculate balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NoFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}