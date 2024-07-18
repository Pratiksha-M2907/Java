public class BookinfoRunner {
    public static void main(String[] args) {
        Bookinfo b1 = new Bookinfo(1);
        Bookinfo b2 = new Bookinfo(1, "Java Programming");
        Bookinfo b3 = new Bookinfo(1, "Java Programming", "John Doe");
        Bookinfo b4 = new Bookinfo(1, "Java Programming", "John Doe", 2020);
        Bookinfo b5 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Shweta");
        Bookinfo b6 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Akshata", 500);
        Bookinfo b7 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Nalini", 500, "Programming");
        Bookinfo b8 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Akila Banu Pathan", 500, "Programming", 450.50);
        Bookinfo b9 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Karuna Gull", 500, "Programming", 450.50, "English");
        Bookinfo b10 = new Bookinfo(1, "Java Programming", "John Doe", 2020, "Kangana R", 500, "Programming", 450.50, "English", "978-1234567890");
    }
}
