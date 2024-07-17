public class JewelleryShopRunner{
public static void main(String[] args){
		
		JewelleryShop jewelleryShop1 = new JewelleryShop(new String[]{"ring", "necklace"}, 5, 5000f, "Shop 1", (short) 10, true);
        JewelleryShop jewelleryShop2 = new JewelleryShop(new String[]{"earrings", "bracelet"}, 3, 3000f, "Shop 2", (short) 8, false);
        JewelleryShop jewelleryShop3 = new JewelleryShop(new String[]{"watch", "chain"}, 4, 4000f, "Shop 3", (short) 9, true);
        JewelleryShop jewelleryShop4 = new JewelleryShop(new String[]{"diamond", "gold"}, 6, 6000f, "Shop 4", (short) 11, false);

        jewelleryShop1.display();
        jewelleryShop2.display();
        jewelleryShop3.display();
        jewelleryShop4.display();
}
}