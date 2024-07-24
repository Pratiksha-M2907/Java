public class GroceryShop {
     String name;
     String location;
     String owner;
     int employeeCount;
     double revenue;
     double expenses;
     String product;
     int quantity;
     double price;
     boolean isOpen;
	 double totalAmount;
    
	public GroceryShop() {
        System.out.println("---Grocery Shop---\n");
    }
	public GroceryShop(String name, String location, String owner, int employeeCount, double revenue, double expenses, String product, int quantity, double price, boolean isOpen) {
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.employeeCount = employeeCount;
        this.revenue = revenue;
        this.expenses = expenses;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.isOpen = isOpen;
    }
	public String ShopAddress(){
			return "Ashirwad Grocery Stor,BTM 2nd Stage,7th Main";//with return type no arguements
	}
	public void displayDetails() {
        System.out.println("Grocery Shop Details:");//No arguements no return type
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println("Revenue: " + revenue);
        System.out.println("Expenses: " + expenses);
        System.out.println("Product: " +product);
        System.out.println("Quantity: " +quantity);
        System.out.println("Price: " +price);
        System.out.println("Is Open: " + isOpen);
    }
	public void TotalAmount(String product,int quantity){  //with arguements no return type
		if(product=="Spices"){
			price=120;
			totalAmount=price*quantity;
			System.out.println("Total Amount is:"+totalAmount);
		}
		else if(product=="Dry Fruits"){
			price=240;
			totalAmount=price*quantity;
			System.out.println("Total Amount is:"+totalAmount);
		}
		else if(product=="Sauces"){
			price=60;
			totalAmount=price*quantity;
			System.out.println("Total Amount is:"+totalAmount);
			
		}
		else{
			price=520;
			totalAmount=price;
			System.out.println("Total Amount is:"+totalAmount);
		}
	}
	public String ShopExperience(String review){	//with arguements and with return type
		if(review=="good"){
			return "Had Great Shopping!";
		}
		else
			return "Shopping wasn't worth";
	}
}
