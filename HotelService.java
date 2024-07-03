public class HotelService {
	public static int roomNumber=102;
	public static String roomType="Single sharing";
	public static int numGuests=4;
	public static String roomStatus="Unoccupied";
	public static String bookingStatus ="confirmed";
	public static String bookingType="online";
	public static int numNights = 4;
	public static int checkInTime=12;
	public static String guestName="Mahesh";
	public static String paymentMethod="credit card";
	public static String roomServiceRequest ="housekeeping";
	
    public static void manageRoomAvailability() {
    if (roomNumber==102){
      System.out.println("Room "+roomNumber+" is available");
    }
	else{
		System.out.println("Check out Your Room No. from Receptionist..");
	}
    if (roomType=="Single sharing") {
      System.out.println("Room booked is "+roomType);
    }
	else{
		System.out.println("Room booked is a family room");
	}
    if (numGuests > 2) {
	  int extraBed=numGuests-2;
      System.out.println("Extra no. of bed required are: "+extraBed);
    }
	else{
		System.out.println("No Extra bed required");
	}
    if (checkInTime < 12) {
      System.out.println("Dear guest you checked-in early!\n You need to pay add-on amount of Rs. 500 Per hour");
    }
	else{
		System.out.println("Dear guest you checked-in at "+checkInTime+" As per booked time\n");
	}
	
    if (roomStatus == "occupied"||roomStatus =="Cleaning") {
      System.out.println("Sorry Guest! Room is not available");
    }
	else{
	   System.out.println("Hearty Welcome!!");
	}
  }

  public static void processBooking() {
    if (bookingStatus == "confirmed") {
      System.out.println("Booking confirmed");
    }
	else{
		System.out.println("Booking Pending! Please confirm your Booking soon");
	}
    if (bookingType=="online") {
      System.out.println("Online booking successful");
    }
	else{
		System.out.println("Room is booked successfully");
	}
    if (numNights > 3) {
      System.out.println("Long stay discount applied");
    }
	else{
		System.out.println("No discount applied");
	}
    if (guestName=="Suresh") {
      System.out.println("Customer discount applied");
    }
	else{
		System.out.println("No Customer discount applied");
	}
    if (paymentMethod == "credit card") {
      System.out.println("Payment processed through card");
    }
	else{
		System.out.println("Payment Successful");
	}
  }

  public static void provideRoomService() {
    if (roomServiceRequest == "food") {
      System.out.println("Food ordered conveyed to server");
    }
   else if (roomServiceRequest == "housekeeping") {
      System.out.println("Housekeeping service provided");
    }
	else if (roomServiceRequest == "laundry") {
      System.out.println("Laundry service provided");
    }
   else if (roomServiceRequest == "tour booking") {
      System.out.println("Tour booking successful");
    }
    else {
      System.out.println("Any other Special request would be considered");
    }
  }
   public static void main(String[] args){
	  System.out.println("\n______Hotel-Service_______\n");
	  manageRoomAvailability();
	  processBooking();
	  provideRoomService();
	  
  }
}
