public class Movies {
public static boolean payment =true;
public static boolean payByScan=true;
public static int ticketsAvailabe=5;
  
  public static void mode(String ... movies){   
    System.out.println("Movies relesed are: \n");
	for(int p=1;p<movies.length;p++){
    System.out.println(" "+p+". "+movies[p]);
	}
	System.out.println("Movie Choosed: "+movies[1]);
}

  public static int ticketAmount(int q) {
    if (q >300) {
      System.out.println(" Ticket amount is "+q+" its too costly");
    } else if( q<=250)
      System.out.println("Ticket price is "+q+" Rs affordable!");
      return q;
  }

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("Your payment successful! Tickets booked!");
    } else {
      System.out.println("Payment failed!Please try again..");
    }
  }
  public static int noOftickets(){
	int noOftickets=8;
	if (noOftickets>ticketsAvailabe)
	{
		System.out.println("Tickets available are: "+ticketsAvailabe+"\n No. Of tickets looking for"+noOftickets+"\nSorry! Tickets Unavailable\n");
	}
	else
		System.out.println("Proceed Booking");
		return 0;
  }
}
