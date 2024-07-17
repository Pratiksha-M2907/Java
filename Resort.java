public class Resort {
    String[] facilities;
    int rooms;
    float price;
    String location;
    short stars;
    boolean hasPool;

    public Resort(String[] facilities, int rooms, float price, String location, short stars, boolean hasPool) {
        this.facilities = facilities;
        this.rooms = rooms;
        this.price = price;
        this.location = location;
        this.stars = stars;
        this.hasPool = hasPool;
    }

    public void display() {
        System.out.println("Resort: " + location);
        System.out.println("Facilities: " + facilities[0]+" and "+facilities[1]);
        System.out.println("Rooms: " + rooms);
        System.out.println("Price: " + price);
        System.out.println("Stars: " + stars);
        System.out.println("Has Pool: " + hasPool);
        System.out.println();
    }
}