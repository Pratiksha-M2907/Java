class GroceryRunner{
public static void main(String args[]){
System.out.println("Apple count: "+Grocery.getAppleCount());
 System.out.println("Grocery Name: "+Grocery.getGroceryName());
 System.out.println("OrangePrice: "+Grocery.getOrangePrice());
 System.out.println("Organic: "+Grocery.isOrganic());
 System.out.println("Grade: "+Grocery.getGrade());
 System.out.println("Quantity: "+Grocery.getQuantity());
 System.out.println("ShelfLife: "+Grocery.getShelfLife());
 System.out.println("ExpirationDate: "+Grocery.getExpirationDate()+"Days");
 System.out.println("Discount: "+Grocery.getDiscount()+"%");
}
}