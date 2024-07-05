public class MeeshoRunner {
    public static void main(String[] args) {
        Meesho.Products("Cloths","Electronics","Homemakers");
        Meesho.Shop();
        System.out.println(Meesho.GetProductCount());
        Meesho.GetProductDetails(1);
    }
}

