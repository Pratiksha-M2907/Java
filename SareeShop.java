public class SareeShop {
    String name;
    String location;
    String owner;
    int employeeCount;
    double revenue;
    double expenses;
    String sareeType;
    int quantity;
    double price;
    boolean isOpen;
    double totalAmount;

    public SareeShop() {
        System.out.println("---Saree Shop---\n");
    }

    public SareeShop(String name, String location, String owner, int employeeCount, double revenue, double expenses, String sareeType, int quantity, double price, boolean isOpen) {
        this.name = name;
        this.location = location;
        this.owner = owner;
        this.employeeCount = employeeCount;
        this.revenue = revenue;
        this.expenses = expenses;
        this.sareeType = sareeType;
        this.quantity = quantity;
        this.price = price;
        this.isOpen = isOpen;
    }

    public String ShopAddress() {
        return "Saree Palace, MG Road, Bangalore"; // with return type no arguments
    }

    public void displayDetails() {
        System.out.println("Saree Shop Details:"); // No arguments no return type
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println("Revenue: " + revenue);
        System.out.println("Expenses: " + expenses);
        System.out.println("Saree Type: " + sareeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Is Open: " + isOpen);
    }

    public void TotalAmount(String sareeType, int quantity) { // with arguments no return type
        if (sareeType == "Silk") {
            price = 18000;
            totalAmount = price * quantity;
            System.out.println("Total Amount is:" + totalAmount);
        } else if (sareeType == "Cotton") {
            price = 700;
            totalAmount = price * quantity;
            System.out.println("Total Amount is:" + totalAmount);
        } else if (sareeType == "Georgette") {
            price = 1500;
            totalAmount = price * quantity;
            System.out.println("Total Amount is:" + totalAmount);
        } else {
            price = 600;
            totalAmount = price;
            System.out.println("Casual Wears\nTotal Amount is:" + totalAmount);
        }
    }

    public String ShopExperience(String review) { // with arguments and with return type
        if (review == "good") {
            return "Had Great Shopping!";
        } else
            return "Shopping wasn't worth";
    }
}
