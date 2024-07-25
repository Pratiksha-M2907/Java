public class BusTicketBookingInfoRunner {
    public static void main(String[] args) {
        BusTicketBookingInfo b = new BusTicketBookingInfo();
        b.getBusTicketBookingInfoLength();
        b.BookBusTicket("Bengaluru to Mysuru");
        b.BookBusTicket("Mysuru to Bengaluru");
        b.BookBusTicket("Bengaluru to Hubli");
        b.CancelBusTicket("Mysuru to Bengaluru");
        b.UpdateBusTicket("Bengaluru to Dharwad", "Bengaluru to Hubli");
        b.SearchBusTicket("Bengaluru to Mysuru");
    }
}
