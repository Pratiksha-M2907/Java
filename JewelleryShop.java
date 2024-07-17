public class JewelleryShop {
    String[] items;
    int staff;
    float revenue;
    String address;
    short years;
    boolean hasSale;

    public JewelleryShop(String[] items, int staff, float revenue, String address, short years, boolean hasSale) {
        this.items = items;
        this.staff = staff;
        this.revenue = revenue;
        this.address = address;
        this.years = years;
        this.hasSale = hasSale;
    }

    public void display() {
        System.out.println("Jewellery Shop: " + address);
        System.out.println("Items: " + items[0]+" and "+items[1]);
        System.out.println("Staff: " + staff);
        System.out.println("Revenue: " + revenue);
        System.out.println("Years: " + years);
        System.out.println("Has Sale: " + hasSale);
        System.out.println();
    }
}