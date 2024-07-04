public class Breakfast{
public static float time=8.40f;
public static void time()
{
 System.out.println("\nBreakfast time is "+time);
}

public static void quantity(String qty)
{
   System.out.println("Qty: " +qty);

}

public static void varities(String... var)
{   System.out.println("Varities are: \n");
	for(int bf=1;bf<var.length;bf++){
    System.out.println(" "+bf+". "+var[bf]);
	}
}

public static int cost (String bfName, int cost)
{
	if(bfName=="Idli")
	{
		System.out.println("Breakfast is: "+bfName);
		System.out.println("Breakfast cost is: "+cost+ " Rs");
	}
	else
	
		System.out.println("Breakfast is: "+bfName+" Cost is:\n");
		return 50; 
}

}
