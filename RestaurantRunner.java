public class RestaurantRunner{
public static void main(String[] args) {

        Restaurant r1 = new Restaurant(new String[]{"Choclate Shake", "Sandwiches"}, 50, 4.5f, "Saffron Vegiterian cuisine", (short)35, true);
        Restaurant r2 = new Restaurant(new String[]{"salad", "soup"}, 20, 4.2f, "Annapurneshwari", (short) 5, false);
        Restaurant r3 = new Restaurant(new String[]{"Veg curry", "rice"}, 30, 4.1f, "Kareem's Kichen", (short) 7, true);
        Restaurant r4 = new Restaurant(new String[]{"noodles", "dumplings"}, 40, 4.3f, "One Bite", (short) 8, false);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
}
}