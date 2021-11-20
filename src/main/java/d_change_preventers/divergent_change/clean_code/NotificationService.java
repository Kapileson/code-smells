package d_change_preventers.divergent_change.clean_code;

public class NotificationService {

    AccountService accountInfo;

    NotificationService(AccountService accountInfo){
        this.accountInfo = accountInfo;
    }

    public void sendNotifications(long withdrawnAmount){
        sendEmailNotification(withdrawnAmount);
        sendMobileNotification(withdrawnAmount);
    }

    private void sendEmailNotification(long withdrawnAmount){
        if(isWithdrawLimit(withdrawnAmount)){
            System.out.println("Sending notification to Account holder's Email");
        }
    }

    private void sendMobileNotification(long withdrawnAmount){
        if(isWithdrawLimit(withdrawnAmount)){
            System.out.println("Sending notification to Account holder's mobile number");
        }
    }

    private boolean isWithdrawLimit(long withdrawnAmount){
        return withdrawnAmount>=5000;
    }
}
