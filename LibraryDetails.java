public class LibraryDetails {
    String[] booksiread;
    int shelves;
    float area;
    String address;
    short staff;
    boolean hasCafe;

    public LibraryDetails(String[] booksiread, int shelves, float area, String address, short staff, boolean hasCafe) {
        this.booksiread = booksiread;
        this.shelves = shelves;
        this.area = area;
        this.address = address;
        this.staff = staff;
        this.hasCafe = hasCafe;
    }

    public void display() {
        System.out.println("Library: " + address);
        System.out.println("Books I read are: " + booksiread[0]+" and "+booksiread[1]);
        System.out.println("Shelves: " + shelves);
        System.out.println("Area: " + area);
        System.out.println("Staff: " + staff);
        System.out.println("Has Cafe: " + hasCafe);
        System.out.println();
    }
}