public class BusTicketBookingInfo {
    public int index = 0;
    public String busTickets[] = new String[5];

    public int getBusTicketBookingInfoLength() {
        return busTickets.length;
    }

    public void displayBusTickets() {
        System.out.println("\nRead Operation: ");
        System.out.println("Array elements are:\n");
        for (int index = 0; index < this.getBusTicketBookingInfoLength(); index++) {
            System.out.println("busTickets[" + index + "]=" + busTickets[index]);
        }
    }

    public void BookBusTicket(String ele) {
        System.out.println("\nInsert Operation:");
        if (this.index < this.getBusTicketBookingInfoLength()) {
            System.out.println("Array has Space for insertion");
            System.out.println("Insert element: " + ele);
            this.busTickets[index] = ele;
            this.index++;
        } else {
            System.out.println("Array has no enough Space for insertion\n cannot insert element " + ele);
        }
        this.displayBusTickets();
    }

    public void CancelBusTicket(String ele) {
        System.out.println("\nDelete Operation:");
        for (int index = 0; index < this.getBusTicketBookingInfoLength(); index++) {
            if (this.busTickets[index] == ele) {
                System.out.println("Element Deleted");
                this.busTickets[index] = null;
            } else
                System.out.println("Element cannot be Deleted");
        }
        this.displayBusTickets();
    }

    public void UpdateBusTicket(String ele, String oldele) {
        System.out.println("\nUpdate Operation:");
        for (int index = 0; index < this.getBusTicketBookingInfoLength(); index++) {
            if (this.busTickets[index] == oldele) {
                this.busTickets[index] = ele;
                System.out.println("Element Updated from " + oldele + " to " + ele);
            } else
                System.out.println("Element cannot be updated");
        }
        this.displayBusTickets();
    }

    public void SearchBusTicket(String ele) {
        System.out.println("\nSearch Operation:");
        for (int index = 0; index < this.getBusTicketBookingInfoLength(); index++) {
            if (this.busTickets[index] == ele) {
                System.out.println("Element found " + ele);
            } else
                System.out.println("Element Not found");
        }
        this.displayBusTickets();
    }
}