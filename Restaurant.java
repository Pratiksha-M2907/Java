public class Restaurant {
    String[] myorder;
    int capacity;
    float rating;
    String name;
    short staff;
    boolean isOpen;

    public Restaurant(String[] myorder, int capacity, float rating, String name, short staff, boolean isOpen) {
        this.myorder = myorder;
        this.capacity = capacity;
        this.rating = rating;
        this.name = name;
        this.staff = staff;
        this.isOpen = isOpen;
    }

    public void display() {
        System.out.println("Restaurant: " + name);
        System.out.println("Myorder" + myorder[0]+" and "+myorder[1]);
        System.out.println("Capacity: " + capacity);
        System.out.println("Rating: " + rating);
        System.out.println("Staff: " + staff);
        System.out.println("Is Open: " + isOpen);
        System.out.println();
    }
}
