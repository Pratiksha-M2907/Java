public class Amazon {
public static boolean payment =true;
  
  public static void categories(String ... pro){   
    System.out.println("Categories are: \n");
	for(int p=1;p<pro.length;p++){
    System.out.println(" "+p+". "+pro[p]);
	}
}

  public static int qty(int q) {
    if (q == 1) {
      System.out.println("You have added one item to cart");
    } else
      System.out.println("Your Cart has "+q+" items");
      return q;
  }

  public static void paymentstatus() {
    if (payment==true) {
      System.out.println("Your payment is received and order is placed!");
    } else {
      System.out.println("Payment is pending!");
    }
  }
  public static int cost(){
	int cost_of_product=366;
	int qty=3;
	if (qty>1)
	{
		int cost=qty*cost_of_product;
		System.out.println("Cost is: "+cost);
	}
	else
		System.out.println("Cost is: "+cost_of_product);
		return 0;
  }
}
