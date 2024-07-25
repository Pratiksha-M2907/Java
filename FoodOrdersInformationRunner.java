public class FoodOrdersInformationRunner {
    public static void main(String[] args) {
        FoodOrdersInformation f = new FoodOrdersInformation();
        f.getFoodOrdersInfoLength();
        f.AddFoodOrder("Pizza");
        f.AddFoodOrder("Burger");
        f.AddFoodOrder("Fries");
        f.DeleteFoodOrder("Fries");
        f.UpdateFoodOrder("Cheese Burger", "Burger");
        f.SearchFoodOrder("Pizza");
    }
}
