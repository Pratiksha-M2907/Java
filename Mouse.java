public class Mouse {
    String brand;
    String type;
    double price;
    int quantity;
    boolean isWireless;

    public Mouse(String brand, String type, double price, int quantity, boolean isWireless) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.isWireless = isWireless;
        System.out.println("Brand: " + brand + "\nType: " + type + "\nPrice: " + price + "\nQuantity: " + quantity + "\nIs Wireless: " + isWireless);
    }

    public void checkAffordability(double price) {
        if (price < 500) {
            System.out.println("This mouse is Budget-Friendly");
        } else {
            System.out.println("This mouse is not Budget-Friendly");
        }
    }

    public void checkAvailability(boolean isWireless, int quantity) {
        if (isWireless && quantity > 0) {
            System.out.println("This mouse is available in stock");
        } else {
            System.out.println("This mouse is not available in stock");
        }
    }

    public void checkGamingMouse(String type) {
        if (type == "Gaming") {
            System.out.println("This mouse is a gaming mouse");
        } else {
            System.out.println("This mouse is not a gaming mouse");
        }
    }

    public void checkDiscount(double price, int quantity) {
        if (price < 1000 && quantity > 5) {
            System.out.println("This mouse is discounted");
        } else {
            System.out.println("This mouse is not discounted");
        }
    }

    public void checkPremium(String brand) {
        if (brand == "Logitech" || brand == "Razer" || brand == "SteelSeries") {
            System.out.println("This mouse is a premium product");
        } else {
            System.out.println("This mouse is not a premium product");
        }
    }
}
