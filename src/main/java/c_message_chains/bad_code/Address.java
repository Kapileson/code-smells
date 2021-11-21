package c_message_chains.bad_code;

public class Address {
    private Country country;

    public Address(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
