class Drinks {
    public static void main(String[] args) {
        String drinkName = "Choclate Tea";
        String drinkCategory = "Beverages";
        String drinkSize = "Medium";
        double drinkPrice = 4.50;
        String[] drinkIngredients = {"Tea powder", "milk", "ice","Coco Powder"};
        int drinkCalories = 170;
        int drinkCaffeine = 110;
        String drinkCustomizations = "sugar-free";
        int drinkPopularity = 8;
        boolean drinkAvailability = true;
        String drinkPromotion = "Buy one, get one free";
        int drinkLoyaltyPoints = 25;
        System.out.println("Drink Name: " + drinkName);
        System.out.println("Drink Category: " + drinkCategory);
        System.out.println("Drink Size: " + drinkSize);
        System.out.println("Drink Price: $" + drinkPrice);
        System.out.println("Drink Ingredients: " + String.join(", ", drinkIngredients));
        System.out.println("Drink Calorie Count: " + drinkCalories + " calories");
        System.out.println("Drink Caffeine Content: " + drinkCaffeine + " mg");
        System.out.println("Drink Customization Options: " + drinkCustomizations);
        System.out.println("Drink Popularity: " + drinkPopularity + " out of 10");
        System.out.println("Drink Availability: " + drinkAvailability);
        System.out.println("Drink Promotion: " + drinkPromotion);
        System.out.println("Drink Loyalty Points: " + drinkLoyaltyPoints);
    }
}
