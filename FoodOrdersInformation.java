public class FoodOrdersInformation {
    public int index = 0;
    public String foodOrders[] = new String[5];

    public int getFoodOrdersInfoLength() {
        return foodOrders.length;
    }

    public void displayFoodOrders() {
        System.out.println("\nRead Operation: ");
        System.out.println("Array elements are:\n");
        for (int index = 0; index < this.getFoodOrdersInfoLength(); index++) {
            System.out.println("foodOrders[" + index + "]=" + foodOrders[index]);
        }
    }

    public void AddFoodOrder(String ele) {
        System.out.println("\nInsert Operation:");
        if (this.index < this.getFoodOrdersInfoLength()) {
            System.out.println("Array has Space for insertion");
            System.out.println("Insert element: " + ele);
            this.foodOrders[index] = ele;
            this.index++;
        } else {
            System.out.println("Array has no enough Space for insertion\n cannot insert element " + ele);
        }
        this.displayFoodOrders();
    }

    public void DeleteFoodOrder(String ele) {
        System.out.println("\nDelete Operation:");
        for (int index = 0; index < this.getFoodOrdersInfoLength(); index++) {
            if (this.foodOrders[index] == ele) {
                System.out.println("Element Deleted");
                this.foodOrders[index] = null;
            } else
                System.out.println("Element cannot be Deleted");
        }
        this.displayFoodOrders();
    }

    public void UpdateFoodOrder(String ele, String oldele) {
        System.out.println("\nUpdate Operation:");
        for (int index = 0; index < this.getFoodOrdersInfoLength(); index++) {
            if (this.foodOrders[index] == oldele) {
                this.foodOrders[index] = ele;
                System.out.println("Element Updated from " + oldele + " to " + ele);
            } else
                System.out.println("Element cannot be updated");
        }
        this.displayFoodOrders();
    }

    public void SearchFoodOrder(String ele) {
        System.out.println("\nSearch Operation:");
        for (int index = 0; index < this.getFoodOrdersInfoLength(); index++) {
            if (this.foodOrders[index] == ele) {
                System.out.println("Element found " + ele);
            } else
                System.out.println("Element Not found");
        }
        this.displayFoodOrders();
    }
}
