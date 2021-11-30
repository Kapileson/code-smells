package e_object_orientation_absuers.temp_field.clean_code;

class Product {

    public double getPrice(int quantity, double itemPrice) {
        double basePrice = basePrice(quantity, itemPrice);
        double discountFactor = discountFactor(basePrice);
        return  basePrice * discountFactor;
    }

    private double basePrice(int quantity, double itemPrice) {
        return quantity * itemPrice;
    }

    private double discountFactor(double basePrice) {
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