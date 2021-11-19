package change_preventers.shotgun_surgery.bad_code;

public class AccountService {

    private int accountNumber;
    private String holderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: "+accountNumber+" Account Holder: "+holderName+" Balance: "+balance);
    }
}
