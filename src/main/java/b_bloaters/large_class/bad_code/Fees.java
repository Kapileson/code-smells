package b_bloaters.large_class.bad_code;

public class Fees {
    private final String feesReceiptNumber;

    public Fees(String feesReceiptNumber) {
        this.feesReceiptNumber = feesReceiptNumber;
    }

    boolean isPaid(){
        return true;
     }

    public String getFeesReceiptNumber() {
        return feesReceiptNumber;
    }
}
