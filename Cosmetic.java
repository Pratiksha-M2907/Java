public class Cosmetic {
	
     String brand;
     String type;
     double price;
     int quantity;
     boolean isAvailable;
	 
	 public Cosmetic(String brand, String type, double price, int quantity, boolean isAvailable) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
		System.out.println("Brand: "+brand+"\nType: "+type+"\nPrice"+price+"\nQuantity: "+quantity+"\nIsAvailable: "+isAvailable);
    }

	public void checkAffordability(double price) {
        if (price < 500) {
            System.out.println("This cosmetic is Budget-Friendly");
        } else {
            System.out.println("This cosmetic is not Budget-Friendly");
        }
    }
	
	public void checkAvailability(boolean isAvailable,int quantity) {
        if (isAvailable && quantity > 0) {
            System.out.println("This cosmetic is available in stock");
        } else {
            System.out.println("This cosmetic is not available in stock");
        }
    }

	public void checkSkincare(String type) {
        if (type=="Skincare") {
            System.out.println("This cosmetic is a skincare product");
        } else {
            System.out.println("This cosmetic is not a skincare product");
        }
    }
	public void checkDiscount(double price,int quantity) {
        if (price < 1000 && quantity > 5) {
            System.out.println("This cosmetic is discounted");
        } else {
            System.out.println("This cosmetic is not discounted");
        }
    }

	public void checkPremium(String brand) {
        if (brand=="L'Oreal" || brand=="Maybelline"|| brand=="Lakme") {
            System.out.println("This cosmetic is a premium product");
        } else {
            System.out.println("This cosmetic is not a premium product");
        }
    }
}
