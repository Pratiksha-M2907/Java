public class PlaneTicketsInfoRunner{
	public static void main(String[] args) {
        PlaneTicketsInfo p = new PlaneTicketsInfo();
        String[] passengerNames = {"Amruta", "Pratiksha"};
        int[] seatNumbers = {6,7};
        String[] flightNumbers = {"FL106", "FL107"};
        String[] departureTimes = {"08:00", "08:00"};
        p.setPlaneTicketsInfo(passengerNames, seatNumbers, flightNumbers, departureTimes);
		p.display();
    }
}