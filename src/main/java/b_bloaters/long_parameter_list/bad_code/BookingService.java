package b_bloaters.long_parameter_list.bad_code;

public class BookingService {

    private final String from;
    private final String to;
    private String departDate;
    private String returnDate;

    private final String name;
    private final int age;

    public BookingService(String from, String to, String departDate,String returnDate, String name, int age) {
        this.from = from;
        this.to = to;
        this.departDate = departDate;
        this.returnDate = returnDate;
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
