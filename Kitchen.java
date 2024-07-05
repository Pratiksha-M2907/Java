
class Kitchen {
    
public static void BreakfastsCooked(String... var)
{   System.out.println("Varities are: \n");
	for(int bf=1;bf<var.length;bf++){
    System.out.println(" "+bf+". "+var[bf]);
	}
}

    public static int GetMealCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetMealDetails(int mealId) {
        if (mealId > 0) {
            return "Meal Name: Pizza, Ingredients: Cheese, Tomato Sauce";
        } else {
            return "Meal Id is invalid";
        }
    }
	public static void Cook() {
        if (true) {
            System.out.println("Kitchen Cooking");
        } else {
            System.out.println("Kitchen Not Cooking");
        }
    }
}
