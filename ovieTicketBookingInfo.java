public class MovieTicketBookingInfo {
    public int index = 0;
    public String movieTickets[] = new String[5];

    public int getMovieTicketBookingInfoLength() {
        return movieTickets.length;
    }

    public void displayMovieTickets() {
        System.out.println("\nRead Operation: ");
        System.out.println("Array elements are:\n");
        for (int index = 0; index < this.getMovieTicketBookingInfoLength(); index++) {
            System.out.println("movieTickets[" + index + "]=" + movieTickets[index]);
        }
    }

    public void BookMovieTicket(String ele) {
        System.out.println("\nInsert Operation:");
        if (this.index < this.getMovieTicketBookingInfoLength()) {
            System.out.println("Array has Space for insertion");
            System.out.println("Insert element: " + ele);
            this.movieTickets[index] = ele;
            this.index++;
        } else {
            System.out.println("Array has no enough Space for insertion\n cannot insert element " + ele);
        }
        this.displayMovieTickets();
    }

    public void CancelMovieTicket(String ele) {
        System.out.println("\nDelete Operation:");
        for (int index = 0; index < this.getMovieTicketBookingInfoLength(); index++) {
            if (this.movieTickets[index] == ele) {
                System.out.println("Element Deleted");
                this.movieTickets[index] = null;
            } else
                System.out.println("Element cannot be Deleted");
        }
        this.displayMovieTickets();
    }

    public void UpdateMovieTicket(String ele, String oldele) {
        System.out.println("\nUpdate Operation:");
        for (int index = 0; index < this.getMovieTicketBookingInfoLength(); index++) {
            if (this.movieTickets[index] == oldele) {
                this.movieTickets[index] = ele;
                System.out.println("Element Updated from " + oldele + " to " + ele);
            } else
                System.out.println("Element cannot be updated");
        }
        this.displayMovieTickets();
    }

    public void SearchMovieTicket(String ele) {
        System.out.println("\nSearch Operation:");
        for (int index = 0; index < this.getMovieTicketBookingInfoLength(); index++) {
            if (this.movieTickets[index] == ele) {
                System.out.println("Element found " + ele);
            } else
                System.out.println("Element Not found");
        }
        this.displayMovieTickets();
    }
}
