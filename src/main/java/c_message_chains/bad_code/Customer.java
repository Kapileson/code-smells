package c_message_chains.bad_code;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }
}
