package object_orientation_absuers.temp_field.clean_code;

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
}