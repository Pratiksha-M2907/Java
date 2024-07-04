public class Coffee{
public static String coffeeType="ColdCoffee";
public static void type()
{
 System.out.println("Coffee Type is "+coffeeType);
}

public static void quantity(int qty)
{
   System.out.println("Qty: "+qty+" cups");

}

public static void varities(String... var)
{   System.out.println("Varities are: \n");
	for(int cof=1;cof<var.length;cof++){
    System.out.println(" "+cof+". "+var[cof]);
	}
}

public static int cost (int cost)
{
	if(coffeeType=="HotCoffee")
	{
		System.out.print("Cofee cost is: "+cost);
	}
	else
	
		System.out.println("Cost is: ");
		return 20; 
}

}
