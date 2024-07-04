public class Policestation {
public static boolean theft=true;
public static boolean callDetails=true; 
  
  public static void departmentcases(String ... cases){   
    System.out.println(":Case Categories are: \n");
	for(int p=1;p<cases.length;p++){
    System.out.println(" "+p+". "+cases[p]);
	}
}

  public static int pendingcases(int q) {
    if (q >10) {
      System.out.println("There are "+q+ " Ongoing cases");
    } else
      System.out.println("Fewer cases ongoing");
      return q;
  }

  public static void theft() {
    if (theft==true) {
      System.out.println("Theft case filed,Theft amount or belongings must be reported ");
    } else {
      System.out.println(" Crime specific actions will be taken");
    }
  }
  public static long phno(){
	if (callDetails==true)
	{
		long phno=85321688735l;
		System.out.println("Suspected Phone number is: "+phno);
	}
	else
		System.out.println("invalid Phone no.\n");
		return 0l;
  }
}
