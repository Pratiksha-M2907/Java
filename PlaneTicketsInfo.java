public class PlaneTicketsInfo {
    private String[] passengerNames;
    private int[] seatNumbers;
    private String[] flightNumbers;
    private String[] departureTimes;

    public void setPlaneTicketsInfo(String[] passengerNames, int[] seatNumbers, String[] flightNumbers, String[] departureTimes) {
        this.passengerNames = passengerNames;
        this.seatNumbers = seatNumbers;
        this.flightNumbers = flightNumbers;
        this.departureTimes = departureTimes;
    }
	public void display() {
        for (int i = 0; i < passengerNames.length; i++) {
            System.out.println("Passenger Name: " + passengerNames[i]);
            System.out.println("Seat Number: " + seatNumbers[i]);
            System.out.println("Flight Number: " + flightNumbers[i]);
            System.out.println("Departure Time: " + departureTimes[i]+" pm");
            System.out.println();
        }
    }
}
