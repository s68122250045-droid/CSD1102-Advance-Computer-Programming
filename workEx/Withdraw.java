public class Withdraw {

    public static void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new MyTestException("Insufficient balance", 2001);
        }
        System.out.println("Withdraw successful");
    }

    public static void main(String[] args) {
        double balance = 4500;
        double amount = 5000;

        try {
            withdraw(balance, amount);
        } catch (MyTestException e) {
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
