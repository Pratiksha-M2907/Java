public class Houseinfo{
int id;
String address;
String type;
String size;
int bedrooms;
int bathrooms;
double price;
String location;
String ownerName;
long ownerPhone;
Houseinfo(int id){
	this.id=id;
	System.out.println("House id: " +id);
	System.out.println("\n");
}
Houseinfo(int id,String address){
	this.id=id;
	this.address=address;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type){
	this.id=id;
	this.address=address;
	this.type=type;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: " +type);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms,int bathrooms){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	this.bathrooms=bathrooms;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("Bathrooms: "+bathrooms);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms,int bathrooms,double price){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	this.bathrooms=bathrooms;
	this.price=price;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("Bathrooms: "+bathrooms);
	System.out.println("Price: "+price);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms,int bathrooms,double price,String location){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	this.bathrooms=bathrooms;
	this.price=price;
	this.location=location;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("Bathrooms: "+bathrooms);
	System.out.println("Price: "+price);
	System.out.println("Location: "+location);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms,int bathrooms,double price,String location,String ownerName){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	this.bathrooms=bathrooms;
	this.price=price;
	this.location=location;
	this.ownerName=ownerName;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("Bathrooms: "+bathrooms);
	System.out.println("Price: "+price);
	System.out.println("Location: "+location);
	System.out.println("Owner: "+ownerName);
	System.out.println("\n");
}
Houseinfo(int id,String address,String type,String size,int bedrooms,int bathrooms,double price,String location,String ownerName,long ownerPhone){
	this.id=id;
	this.address=address;
	this.type=type;
	this.size=size;
	this.bedrooms=bedrooms;
	this.bathrooms=bathrooms;
	this.price=price;
	this.location=location;
	this.ownerName=ownerName;
	System.out.println("House id: " +id);
	System.out.println("Address: " +address);
	System.out.println("Type: "+type);
	System.out.println("Size: "+size);
	System.out.println("Bedrooms: "+bedrooms);
	System.out.println("Bathrooms: "+bathrooms);
	System.out.println("Price: "+price);
	System.out.println("Location: "+location);
	System.out.println("Owner: "+ownerName);
	System.out.println("Owner Contact: "+ownerPhone);
	System.out.println("\n");
}
}

