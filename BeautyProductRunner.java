public class BeautyProductRunner{
    public static void main(String[] args) {
        System.out.println("Beauty Product Count:"+BeautyProduct.getProductCount());
        System.out.println("Beauty Product Name:"+BeautyProduct.getProductName());
        System.out.println("Beauty Product Price:"+BeautyProduct.getProductPrice());
        System.out.println("Cruelty Free:"+BeautyProduct.isCrueltyFree());
        System.out.println("Rating:"+BeautyProduct.getRating());
        System.out.println("Product Size:"+BeautyProduct.getProductSize());
        System.out.println("Shelf Life:"+BeautyProduct.getShelfLife());
        System.out.println("Expiration Date:"+BeautyProduct.getExpirationDate());
        System.out.println("Discount:"+BeautyProduct.getDiscount()+"%");
	}
}
