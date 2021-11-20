package d_change_preventers.shotgun_surgery.bad_code;

public class WithdrawService {

    AccountService account;

    WithdrawService(AccountService account){
        this.account = account;
    }

    public void withdraw(double amount) throws Exception {
        if (account.getBalance() >= amount) {
            if(amount>=500){
                account.setBalance(account.getBalance() - amount);
                System.out.println("Balance after withdrawn: " + account.getBalance());
            }else{
                throw new Exception("Minimum amount to withdraw should be 500");
            }
        }
    }
}
