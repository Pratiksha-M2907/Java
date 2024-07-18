public class VehicleInfo{

int id;
String type;
String model;
int year;
String color;
int mileage;
String fuelType;
int engineCapacity;
String number;
String insuranceExpiry;

VehicleInfo(int id){
	this.id=id;
	System.out.println("Vehicle id: " +id);
	System.out.println("\n");
}
VehicleInfo(int id, String type){
	this.id=id;
	this.type=type;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model){
	this.id=id;
	this.type=type;
	this.model=model;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("\n");
}

VehicleInfo(int id, String type,String model,int year){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color,int mileage){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	this.mileage=mileage;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("Milage: "+mileage+" kmpl");
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color,int mileage,String fuelType){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	this.mileage=mileage;
	this.fuelType=fuelType;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("Milage: "+mileage);
	System.out.println("Fuel Type: "+fuelType);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color,int mileage,String fuelType,int engineCapacity){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	this.mileage=mileage;
	this.fuelType=fuelType;
	this.engineCapacity=engineCapacity;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("Milage: "+mileage+" kmpl");
	System.out.println("Fuel Type: "+fuelType);
	System.out.println("Engine Capacity: "+engineCapacity);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color,int mileage,String fuelType,int engineCapacity,String registrationNumber){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	this.mileage=mileage;
	this.fuelType=fuelType;
	this.engineCapacity=engineCapacity;
	this.number=number;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("Milage: "+mileage+" kmpl");
	System.out.println("Fuel Type: "+fuelType);
	System.out.println("Engine Capacity: "+engineCapacity);
	System.out.println("number"+number);
	System.out.println("\n");
}
VehicleInfo(int id, String type,String model,int year,String color,int mileage,String fuelType,int engineCapacity,String number,String insuranceExpiry){
	this.id=id;
	this.type=type;
	this.model=model;
	this.year=year;
	this.color=color;
	this.mileage=mileage;
	this.fuelType=fuelType;
	this.engineCapacity=engineCapacity;
	this.number=number;
	this.insuranceExpiry=insuranceExpiry;
	System.out.println("Employee id: " +id);
	System.out.println("Type: "+type);
	System.out.println("Model: "+model);
	System.out.println("Year: "+year);
	System.out.println("Color: "+color);
	System.out.println("Milage: "+mileage+" kmpl");
	System.out.println("Fuel Type: "+fuelType);
	System.out.println("Engine Capacity: "+engineCapacity);
	System.out.println("number: "+number);
	System.out.println("InsuranceExpiry: "+insuranceExpiry);
	System.out.println("\n");
}
}