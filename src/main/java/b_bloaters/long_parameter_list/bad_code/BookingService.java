package b_bloaters.long_parameter_list.bad_code;

public class BookingService {

    private String from;
    private String to;
    private String departureDate;
    private String returnDate;

    private String name;
    private int age;

    public BookingService(String from, String to, String departureDate,String returnDate, String name, int age) {
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.departureDate = returnDate;
        this.name = name;
        this.age = age;
    }

    public void bookTicket(){
        /*
            currentFlight.addPassengerDetails(passengerDetail,tickets,passengerID);
            currentFlight.flightSummary();
            currentFlight.printDetails();
        */
    }



}
