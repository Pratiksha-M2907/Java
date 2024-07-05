
class Meesho {
    
 public static void Products(String ... products){   
    System.out.println("Floor Details are: \n");
	for(int p=1;p<products.length;p++){
    System.out.println(" "+p+". "+products[p]);
	}
}

    public static int GetProductCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetProductDetails(int productId) {
        if (productId > 0) {
            return "Product Name: T-Shirt, Price: 500";
        } else {
            return "Product Id is invalid";
        }
    }
	public static void Shop() {
        if (true) {
            System.out.println("Meesho Shopping");
        } else {
            System.out.println("Meesho Not Shopping");
        }
    }
}
