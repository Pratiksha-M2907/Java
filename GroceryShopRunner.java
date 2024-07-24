public class GroceryShopRunner{
	public static void main(String[] args){
		GroceryShop g=new GroceryShop();
		GroceryShop g1=new GroceryShop("Ashirwad","BTM,Bangalore"," Ashish Sharma",25,15000.85,562,"Dry Fruits",2,240,true);
		System.out.println("Shop Address:"+g1.ShopAddress());
		g1.displayDetails();
		g1.TotalAmount("Dry Fruits",2);
		g1.ShopExperience("good");
	}
}