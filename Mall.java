public class Mall {
public static boolean payment =true;
public static String modeOfcontact="mobile number";
  public static void floorDetails(String ... floors){   
    System.out.println("Floor Details are: \n");
	for(int p=1;p<floors.length;p++){
    System.out.println(" "+p+". "+floors[p]);
	}
}

  public static String shop(String brand, String productName,boolean brand_avail, double price) {
	  System.out.println("looking for: "+productName+" of"+brand);
    if (brand_avail==true)
      System.out.println(productName+" of brand "+brand+" is available"+" it's price is "+price);
    else
		System.out.println("Brand not available..");
      return null;
  }

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("Your payment successful");
    } else {
      System.out.println("Payment failed");
    }
  }
  public static long phno(){
	if (modeOfcontact=="mobile number")
	{
		long phno=85321688735l;
		System.out.println("Thantks for Shopping with us! Visit again\n");
	}
	else
		System.out.println("invalid Phone no.\n");
		return 0l;
  }
}
