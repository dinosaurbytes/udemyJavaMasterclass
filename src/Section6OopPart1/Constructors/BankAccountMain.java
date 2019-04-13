package Section6OopPart1.Constructors;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.deposit(500);
        bobsAccount.withdrawal(100.00);

        BankAccount tomsAccount = new BankAccount(500);
        tomsAccount.withdrawal(499);
    }
}
