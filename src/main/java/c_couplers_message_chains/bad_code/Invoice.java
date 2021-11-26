package c_couplers_message_chains.bad_code;

import java.util.Map;

public class Invoice {

    private final Customer customer;
    private Map<String,Double> invoiceItems;
    public Invoice(Customer customer) {
        this.customer = customer;
    }

    public void addItem(Map<String,Double> invoiceItems){
        this.invoiceItems.putAll(invoiceItems);
    }

    public double getTotalPrice(String itemName){
        final double SHIPPING_COST_OUTSIDE_INDIA = 1000;
        double invoiceTotal = this.invoiceItems.get(itemName);
        
        if(!customer.getAddress().getCountry().isOutsideIndia()){
            invoiceTotal += SHIPPING_COST_OUTSIDE_INDIA;
        }
        return invoiceTotal;
    }
}
