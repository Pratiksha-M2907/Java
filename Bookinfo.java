public class Bookinfo {
    int id;
    String title;
    String author;
    int year;
    String publisher;
    int pages;
    String genre;
    double price;
    String language;
    String isbn;

    Bookinfo(int id) {
        this.id= id;
        System.out.println("Book id: " + id);
        System.out.println("\n");
    }
    Bookinfo(int id, String title) {
        this.id= id;
        this.title = title;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("\n");
    }
    Bookinfo(int id, String title, String author) {
        this.id= id;
        this.title = title;
        this.author = author;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("\n");
    }
    Bookinfo(int id, String title, String author, int year) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("\n");
    }
	Bookinfo(int id, String title, String author, int year, String publisher) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("\n");
    }

    Bookinfo(int id, String title, String author, int year, String publisher, int pages) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("\n");
    }
    Bookinfo(int id, String title, String author, int year, String publisher, int pages, String genre) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("\n");
    }
    Bookinfo(int id, String title, String author, int year, String publisher, int pages, String genre, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
        this.price = price;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
		System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("\n");
    }
    Bookinfo(int id, String title, String author, int year, String publisher, int pages, String genre, double price, String language) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
        this.genre = genre;
        this.price = price;
        this.language = language;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Language: " + language);
        System.out.println("\n");
    }

    Bookinfo(int id, String title, String author, int year, String publisher, int pages, String genre, double price, String language, String isbn) {
        this.id= id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.pages = pages;
		this.genre = genre;
        this.price = price;
        this.language = language;
        this.isbn = isbn;
        System.out.println("Book id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Language: " + language);
        System.out.println("ISBN: " + isbn);
        System.out.println("\n");
    }
}




