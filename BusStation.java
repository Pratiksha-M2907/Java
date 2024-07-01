class BusStation{
 public static boolean isBooked = true;
     public	 static boolean isDelayed = false;
    public static boolean isCancelled = false;
     
    public static void getBusNumber(String num) {
	     if(num=="KA241236")
         System.out.println("Bus Number is: "+num+" is verified Number");
		 else
		 System.out.println("Bus Number doesnot match");
		 
    }



public static void getBusSchedule() {
        System.out.println("Monday: 7am-9am, 4pm-6pm\n" +
               "Tuesday: 8am-10am, 5pm-7pm\n" +
               "Wednesday: 9am-11am, 6pm-8pm\n" +
               "Thursday: 10am-12pm, 7pm-9pm\n" +
               "Friday: 11am-1pm, 8pm-10pm");
    }

    public static void getTicketPrice(int distanceInMiles) {
        if (distanceInMiles < 5) {
            System.out.println("1.50");
        } else if (distanceInMiles < 10) {
           System.out.println("2.50");
        } else {
            System.out.println("3.50");
        }
    }

      

    public static void  TicketCancel(){
        if (isBooked = false) {   
         System.out.println("Ticket cancelled successfully");
        } else {
            System.out.println("Ticket is already cancelled or not booked");
        }
    }



    public static void Bus_status() {
        if (isDelayed) {
            System.out.println("DELAYED");
        } else if (isCancelled) {
            System.out.println("CANCELLED");
        } else {
            System.out.println("ON_SCHEDULE");
        }
    }
}

