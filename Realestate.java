public class Realestate {
public static boolean payment=true;
public static String owner_contact="Through mobile number";
public static String address="BTM Bangalore";
  
  public static void EstateAmenities(String... luxury){   
    System.out.println("Estate facilities are: \n");
	for(int p=1;p<luxury.length;p++){
    System.out.println(" "+p+". "+luxury[p]);
	}
}

  public static void Buy(long cost) {
    if (cost > 0) {
        System.out.println("Property location" + address + ", Price: " + cost);
    } else {
        System.out.println("Property cost is not mentioned\n");
    }
}

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("You have No dues on property. Its officially granted\n");
    } else {
      System.out.println("Clear the property dues soon!\n");
    }
  }
  public static long ownerContact(){
	if (owner_contact=="Through mobile number")
	{
		long phno=85321688735l;
		System.out.println("Owner Contact no: "+phno);
		System.out.println("Owner details:\n Name: Shweta K\n Locality: Bangalore\n ");
	}
	else
		System.out.println("invalid Phone no.\n.Please provide some valid mode of contact");
		return 0l;
  }
}
