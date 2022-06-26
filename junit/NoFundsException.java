public class NoFundsException extends RuntimeException {
    public NoFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }
}