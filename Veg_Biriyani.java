public class Veg_Biriyani {

    public static void displayIngredients() {
		String ingredients[]={" ","Rice","Veggies-Carrot,Potato,Couliflower,Tomatos,Ginger,Garlic,Beans","Spices-Cumin,Coriender powder,Turmeric,Garam Masala,Salt,Red chilli powder","other-Oil,Lemon juice,Water","Optional-Paneer,Cashews,Fresh mint leave"};
        for(int i=1;i<ingredients.length;i++) 
		System.out.println(i+" "+ingredients[i]);
        
        }
    }
	  public static void displayReview(int rating) {
        if (rating == 10) {
            System.out.println("Great choice!!");
        } else if (rating > 5 && rating < 10) {
            System.out.println("Good one!");
        } else if (rating < 5 && rating>=1) {
            System.out.println("worst!!");
        } else {
            System.out.println("Plese enter rating in range 1-10 ");
        }
    }
public static void calculateTotalPrice(String quality, float price) {
        float totalPrice = 0;
        if (quality == "Premium") {
            totalPrice = price + (price * 0.2);
			System.out.println("Total bill: "+totalPrice);
        } else if (quality == "Standard") {
            totalPrice = price;
			System.out.println("Total bill"+totalPrice);
        } else if (quality == "Economic") {
            totalPrice = price - (price * 0.1); 
			System.out.println("Total bill"+totalPrice);
        } else {
            System.out.println("Invalid Quality");
        }
        
    }

}
