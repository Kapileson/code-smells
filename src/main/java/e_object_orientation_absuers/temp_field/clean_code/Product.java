package e_object_orientation_absuers.temp_field.clean_code;

class Product {

    public double getPrice(int quantity, double itemPrice) {
        double basePrice = getBasePrice(quantity, itemPrice);
        double discountFactor = getDiscountFactor(basePrice);
        return  basePrice * discountFactor;
    }

    private double getBasePrice(int quantity, double itemPrice) {
        return quantity * itemPrice;
    }

    private double getDiscountFactor(double basePrice) {
        return basePrice > 1000 ? 0.95 : 0.98;
    }


//    void placeOrder(Order order){
//        int orderId = order.id;
//        String customerName = order.cusName;
//
//        processOrder(orderId, customerName);
//        System.out.println("Order placed!");
//    }
//
//    void placeOrder(Order order){
//
//        processOrder(Order order);
//        System.out.println("Order placed!");
//    }


}