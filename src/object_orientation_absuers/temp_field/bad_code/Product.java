package object_orientation_absuers.temp_field.bad_code;

class Product {

    int quantity;
    double itemPrice;
    double discountFactor;
    double basePrice;
    double totalPrice;


    public double getPrice(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;

        basePrice();
        discountFactor();
        totalPrice =  basePrice * discountFactor;
        return totalPrice;
    }

    private void basePrice() {
        basePrice = quantity * itemPrice;
    }

    private void discountFactor() {
        if (basePrice > 1000) {
            discountFactor = 0.95;
        }
        else {
            discountFactor = 0.98;
        }
    }
}