public class MovieTicketBookingInfoRunner {
    public static void main(String[] args) {
        MovieTicketBookingInfo m = new MovieTicketBookingInfo();
        m.getMovieTicketBookingInfoLength();
        m.BookMovieTicket("Rajakumara");
        m.BookMovieTicket("Dodmane Hudga");
        m.BookMovieTicket("The Dark Knight");
        m.CancelMovieTicket("Appu");
        m.UpdateMovieTicket("Dodmane Hudga", "James");
        m.SearchMovieTicket("Appu");
    }
}