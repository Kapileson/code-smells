package change_preventers.divergent_change.clean_code;

public class LoanService {

    AccountService accountInfo;

    LoanService(AccountService accountInfo){
        this.accountInfo = accountInfo;
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
}
