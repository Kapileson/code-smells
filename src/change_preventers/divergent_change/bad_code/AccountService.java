package change_preventers.divergent_change.bad_code;

public class AccountService {

    private int accountNumber;
    private double balance;

    AccountService(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(long amount){
        balance+=amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(long amount){
        if (balance >= amount) {
            balance-= amount;
            sendEmailNotification(amount);
            sendMobileNotification(amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }
    }

    public double getLoanInterestRate(String loanType){
        switch (loanType){
            case "Gold":
                return 10.0;
            case "Personal":
                return 13.50;
            default:
                return 0;
        }
    }

    private void sendEmailNotification(long withdrawnAmount){
        if(withdrawnAmount>=5000){
            System.out.println("Sending notification to Account holder's Email");
        }
    }

    private void sendMobileNotification(long withdrawnAmount){
        if(withdrawnAmount>=5000){
            System.out.println("Sending notification to Account holder's mobile number");
        }
    }
}
