public class Pubs {
public static boolean payment =true;
public static String modeOfpay="Through mobile number"; 
  
  public static void NonAlchoholicMenu(String ... menu){   
    System.out.println("Non-Alchoholic Menue:\n");
	for(int p=1;p<menu.length;p++){
    System.out.println(" "+p+". "+menu[p]);
	}
	System.out.println("Drink Ordered is: "+menu[2]);
}

  public static int amount(int q) {
    if (q <200) {
      System.out.println("Budget friendly..Rs"+q);
    } else
      System.out.println("Amount is "+q+" Rs");
      return q;
  }

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("Your payment successful");
    } else {
      System.out.println("Payment failed");
    }
  }
  public static long phno(){
	if (modeOfpay=="Through mobile number")
	{
		long phno=85321688735l;
		System.out.println("Payment done to referred phone no "+phno);
	}
	else
		System.out.println("invalid Phone no.\n");
		return 0l;
  }
}
