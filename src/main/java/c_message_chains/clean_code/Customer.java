package c_message_chains.clean_code;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    boolean isInIndia() {
        return address.isOutsideIndia();
    }
}
