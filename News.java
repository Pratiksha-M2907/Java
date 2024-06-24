public class News {
    static String title = " National News";
    static String category = "Sports";
    static String author = "Pratiksha";
    static int publicationYear = 2024;
    static String publisher = "News 24x7";
public static void main(String args[]){
	String newsTitle = "IPL Update";
    String newsDate = "May 12, 2024";
    String newsContent = "CSK Defeated RR by 5 wickets ";
	    System.out.println("Static Variables:");
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Publisher: " + publisher);
        System.out.println("News Title: " + newsTitle);
        System.out.println("News Date: " + newsDate);
        System.out.println("News Content: " + newsContent);
}
}