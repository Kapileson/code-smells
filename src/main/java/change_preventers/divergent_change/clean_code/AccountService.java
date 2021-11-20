package change_preventers.divergent_change.clean_code;

public class AccountService {

    private int accountNumber;
    private double balance;

    AccountService(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(long amount){
        balance+=amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(long amount){
        if (balance >= amount) {
            balance-= amount;
            new NotificationService(this).sendNotifications(amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }
    }
}
