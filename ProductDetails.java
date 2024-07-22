public class ProductDetails
{
public static String name;
public static double price;
public static double discount = 0.0;

public ProductDetails() {
     System.out.println("Product Information");
    }
public ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
	System.out.println("Product: "+name+"\nPrice: "+price+"\n");
    }
public static double calculateDiscount() {
        if (name=="Laptop") {
            discount = price * 0.20;
        } else if (name=="Plants") {
            discount = price * 0.10;
        } else if (name=="Chair") {
            discount = price * 0.04;
        } else if (name=="Bag") {
            discount = price * 0.07;
        } else if (name=="Pen") {
            discount = price * 0.001;
        } else if (name=="Cloth") {
            discount = price * 0.30;
        }else if (name=="Book") {
            discount = price * 0.7;
        }else if (name=="Smartphone") {
            discount = price * 0.25;
        }else if (name=="Watch") {
            discount = price * 0.10;
        }else if (name=="Beauty Products") {
            discount = price * 0.28;
        }else if (name=="Groceries") {
            discount = price * 0.15;
        }else if (name=="Daily Needs") {
            discount = price * 0.08;
        }else{
			discount = price * 0.05;
		}
		
        return discount;
    }
    public static void displayProductDetails() {
        double discount = calculateDiscount();
        double totalPriceWithDiscount = price - discount;
        System.out.println("Product Name: " + name+"\n");
        System.out.println("Price: Rs" + price+"\n");
        System.out.println("Discount: Rs" + discount+"\n");
        System.out.println("Total Price with Discount: Rs" + totalPriceWithDiscount+"\n");
        System.out.println();
    }
public static void main(String[] args) {
        ProductDetails laptop = new ProductDetails("Laptop", 75000.0);
        ProductDetails plants = new ProductDetails("Plants", 180.0);
        ProductDetails chair = new ProductDetails("Chair", 200.0);
        ProductDetails bag = new ProductDetails("Bag", 485.0);
        ProductDetails pen = new ProductDetails("Pen", 10.0);
        ProductDetails cloth = new ProductDetails("Cloth", 699.0);
		ProductDetails Book=new ProductDetails("Book",85);
		ProductDetails Smartphone=new ProductDetails("Smartphone",35000);
		ProductDetails Watch=new ProductDetails("Watch",3200.56);
		ProductDetails BeautyProducts=new ProductDetails("Beauty Products",1200);
		ProductDetails Groceries=new ProductDetails("Groceries",2500);
		ProductDetails DailyNeeds=new ProductDetails("Daily Needs",580);
		ProductDetails other=new ProductDetails("Note Pad",280);
	    
		System.out.println("----:Product Details:----\n");

        laptop.displayProductDetails();
        plants.displayProductDetails();
        chair.displayProductDetails();
        bag.displayProductDetails();
        pen.displayProductDetails();
        cloth.displayProductDetails();
		Book.displayProductDetails();
		Smartphone.displayProductDetails();
		Watch.displayProductDetails();
		BeautyProducts.displayProductDetails();
		Groceries.displayProductDetails();
		DailyNeeds.displayProductDetails();
		other.displayProductDetails();
    }
}