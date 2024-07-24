public class Book1{
	public String title;
	public String author;
	public int price;
public Book1(){
	System.out.println("Book Details");
}
public Book1(String title){
    this();
	this.title=title;
	System.out.println("Tile of the Book: "+title);
}
public Book1(String title,String author){
	this(title);
	this.title=title;
	this.author=author;
	System.out.println("Tile of the Book: "+title+" Author: "+author);
}
public Book1(String title,String author,int price){
	this(title,author);
	this.title=title;
	this.author=author;
	this.price=price;
	System.out.println("Tile of the Book: "+title+" Author: "+author+"Price: "+price+" Rs");
}
}