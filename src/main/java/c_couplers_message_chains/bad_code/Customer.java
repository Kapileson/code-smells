package c_couplers_message_chains.bad_code;

public class Customer {
    private final Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

}
