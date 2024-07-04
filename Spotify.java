public class Spotify {
public static boolean premium =true;
public static boolean payment=true;
public static String modeOfLogin="Through mobile number"; 
  
  public static void categories(String ... cate){   
    System.out.println("Categories are: \n");
	for(int p=1;p<cate.length;p++){
    System.out.println(" "+p+". "+cate[p]);
	}
}

  public static int premiumamount(int q) {
    if (premium ==true) {
      System.out.println("You choosed Premiumat just at "+q+" Rs");
    } else
      System.out.println("Unlock Premium for add free music");
      return q;
  }

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("You Premium Payment is successful");
    } else {
      System.out.println("Payment failed");
    }
  }
  public static long phno(){
	if (modeOfLogin=="Through mobile number")
	{
		long phno=85321688735l;
		System.out.println("You logged in Through verified Phone no. "+phno);
	}
	else
		System.out.println("invalid Phone no.\n");
		return 0l;
  }
}
