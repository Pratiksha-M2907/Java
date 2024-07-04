public class Phonepay {
public static boolean payment =true;
public static boolean payByScan=true;
public static String mode_chose="Through qr"; 
  
  public static void mode(String ... pro){   
    System.out.println("Payment modes are: \n");
	for(int p=1;p<pro.length;p++){
    System.out.println(" "+p+". "+pro[p]);
	}
}

  public static int amount(int q) {
    if (q >100000) {
      System.out.println("Can't process payment out of limit");
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
	if (mode_chose=="To mobile number")
	{
		long phno=85321688735l;
		System.out.println("Payment done through phone no\n");
	}
	else
		System.out.println("invalid Phone no.\n");
		return 0l;
  }
}
