public class Pen {
	public static int price;
	public static String colour;
	public static String name;

    public static void Details(int price)
	{
		System.out.println("\nPrice is: "+price+" Rs");
	}
	
	public static void Details(int price,String colour)
	{
		System.out.println("\nPrice is: "+price+" Rs");
		System.out.println("\nColour : "+colour);
	}
	
	public static void Details(String name,int price,String colour)
	{
		System.out.println("\nName is: "+name);
		System.out.println("\nPrice is: "+price+" Rs");
		System.out.println("\nColour : "+colour);
	}

}
