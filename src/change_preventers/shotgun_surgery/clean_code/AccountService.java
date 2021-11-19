package change_preventers.shotgun_surgery.clean_code;

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

    public void deposit(double amount) throws Exception {
        if(isMinimumLimit(amount)){
            balance+=amount;
            System.out.println("Balance after deposit: " + balance);
        }else{
            throw new Exception("Minimum amount to deposit should be 500");
        }
    }

    public void withdraw(double amount) throws Exception {
        if (balance >= amount) {
            if(isMinimumLimit(amount)){
                balance+=amount;
                System.out.println("Balance after withdrawn: " + balance);
            }else{
                throw new Exception("Minimum amount to withdraw should be 500");
            }
        }
    }

    private boolean isMinimumLimit(double amount){
        return amount>=500;
    }

}
