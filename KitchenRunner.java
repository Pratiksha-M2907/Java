public class KitchenRunner {
    public static void main(String[] args) {
        Kitchen.Cook();
        Kitchen.BreakfastsCooked(" ","Idli","Dosa","Puri","Upit");
        System.out.println(Kitchen.GetMealCount());
        Kitchen.GetMealDetails(1);
    }
}