class Snacks {
    public static void main(String[] args) {
        String snackName = "Chips";
        String snackCategory = "Baked Goods";
        int snackServingSize = 15;
        int snackCaloriesPerServing = 150;
        double snackPrice = 3.25;
        String snackIngredients = "all-purpose flour, unsalted butter, brown sugar, chilli";
        int snackPopularity = 9;
        boolean snackAvailability = true;

        System.out.println("Snack Name: " + snackName);
        System.out.println("Snack Category: " + snackCategory);
        System.out.println("Snack Serving Size: " + snackServingSize + " cookies");
        System.out.println("Snack Calories per Serving: " + snackCaloriesPerServing + " calories");
        System.out.println("Snack Price: $" + snackPrice);
        System.out.println("Snack Ingredients: " + String.join(", ", snackIngredients));
        System.out.println("Snack Popularity: " + snackPopularity + " out of 10");
        System.out.println("Snack Availability: " + snackAvailability);
    }
}
