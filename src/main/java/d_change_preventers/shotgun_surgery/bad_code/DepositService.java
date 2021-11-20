package d_change_preventers.shotgun_surgery.bad_code;

public class DepositService {

    AccountService account;

    DepositService(AccountService account){
        this.account = account;
    }

    public void deposit(double amount) throws Exception {
        if(amount>=500){
            account.setBalance(account.getBalance() + amount);
            System.out.println("Balance after deposit: " + account.getBalance());
        }else{
            throw new Exception("Minimum amount to deposit should be 500");
        }
    }
}
