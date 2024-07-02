public class Shopping_new {
  public static float gst=0.18f;
  public static float totalPrice;
  public static void setShoppingType(String shoppingType) {
    System.out.println("\nShopping Type: " + shoppingType+"\n");
  }

  public static void calculateTotalPrice(float price) {
    totalPrice = price + (price * gst );
    System.out.println("Total Price including GST: " + totalPrice+"\n");
  }

  public static void setShoppedItem(String itemName, String shoppingType) {
    System.out.println("Shopped Item is: " + itemName + ", Shopping Type is: " + shoppingType+"\n");
  }

  public static void displayShoppingDetails(String shoppingType, String itemName, double totalPrice) {
    System.out.println("_____Shopping Details______\n");
    System.out.println("Shopping Type: " + shoppingType+"\n");
    System.out.println("Item Name: " + itemName+"\n");
    System.out.println("Total Price: " + totalPrice+"\n");
  }
}

