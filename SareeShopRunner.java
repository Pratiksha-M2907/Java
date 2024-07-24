public class SareeShopRunner {
    public static void main(String[] args) {
        SareeShop s = new SareeShop();
        SareeShop s1 = new SareeShop("Saree Palace", "MG Road, Bangalore", "Shashi S.Gadalinganavar", 30, 20000.50, 800, "Silk", 3, 800, true);
        System.out.println("Shop Address: " + s1.ShopAddress());
        s1.displayDetails();
        s1.TotalAmount("Silk", 3);
        System.out.println(s1.ShopExperience("good"));
    }
}
