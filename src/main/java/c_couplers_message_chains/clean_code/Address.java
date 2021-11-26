package c_couplers_message_chains.clean_code;

public class Address {
    private Country country;

    public Address(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    boolean isOutsideIndia(){
       return country.isOutsideIndia();
    }
}
