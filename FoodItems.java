

public class FoodItems {
public static String init() {
return "Method with 0 parameters";
}

public static String init(String name) {
return "Method with 1 parameter: " + name;
}

public static String init(String name, double price) {
return "Method with 2 parameters: " + name + ", " + price;
}

public static String init(String name, double price, int quantity) {
return "Method with 3 parameters: " + name + ", " + price + ", " + quantity;
}

public static String init(String name, double price, int quantity, String category) {
return "Method with 4 parameters: " + name + ", " + price + ", " + quantity + ", " + category;
}

public static String init(String name, double price, int quantity, String category, byte[] image) {
return "Method with 5 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image;
}

public static String init(String name, double price, int quantity, String category, byte[] image, String description) {
return "Method with 6 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image + ", " + description;
}

public static String init(String name, double price, int quantity, String category, byte[] image, String description, int calories) {
return "Method with 7 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image + ", " + description + ", " + calories;
}

public static String init(String name, double price, int quantity, String category, byte[] image, String description, int calories, String ingredients) {
return "Method with 8 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image + ", " + description + ", " + calories + ", " + ingredients;
}

public static String init(String name, double price, int quantity, String category, byte[] image, String description, int calories, String ingredients, boolean isVegan) {
return "Method with 9 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image + ", " + description + ", " + calories + ", " + ingredients + ", " + isVegan;
}

public static String init(String name, double price, int quantity, String category, byte[] image, String description, int calories, String ingredients, boolean isVegan, boolean isGlutenFree) {
return "Method with 10 parameters: " + name + ", " + price + ", " + quantity + ", " + category + ", " + image + ", " + description + ", " + calories + ", " + ingredients + ", " + isVegan + ", " + isGlutenFree;
}
}

