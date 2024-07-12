public class CarDescription {
    public static int totalCarsSold = 1000;
    public static String companyName = "Mahindra";
    public static String model;
    public static String color;
    public static int year;
    public static double price;
    public static boolean isElectric;
    public static double mileage;
    public static String vin;
    public static String ownerName;
    public static String licensePlate;
    public static boolean isInsured;

    public static void Car(String model, String color, int year, double price) {
        CarDescription.model = model;
        CarDescription.color = color;
        CarDescription.year = year;
        CarDescription.price = price;
        CarDescription.isElectric = false;
        CarDescription.mileage = 15.2;
        CarDescription.vin = "1HGCM82633A123456";
        CarDescription.ownerName = "Presha ";
        CarDescription.licensePlate = "KA99p1234";
        CarDescription.isInsured = true;
    }

    public static void displayCarDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Cars Sold: " + totalCarsSold);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: Rs " + price+" lakh");
        System.out.println("Is Electric: " + isElectric);
        System.out.println("Mileage: " + mileage+" kmpl");
        System.out.println("VIN: " + vin);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Is Insured: " + isInsured);
    }
}