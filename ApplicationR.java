
public class Application {
public static String init() {
return "Method with 0 parameters";
}

public static String init(String name) {
return "Method with 1 parameter: " + name;
}

public static String init(String name, String version) {
return "Method with 2 parameters: " + name + ", " + version;
}

public static String init(String name, String version, String developer) {
return "Method with 3 parameters: " + name + ", " + version + ", " + developer;
}

public static String init(String name, String version, String developer, String operatingSystem) {
return "Method with 4 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree) {
return "Method with 5 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree, int size) {
return "Method with 6 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree + ", " + size;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree, int size, String category) {
return "Method with 7 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree + ", " + size + ", " + category;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree, int size, String category, boolean isDownloadable) {
return "Method with 8 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree + ", " + size + ", " + category + ", " + isDownloadable;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree, int size, String category, boolean isDownloadable, String website) {
return "Method with 9 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree + ", " + size + ", " + category + ", " + isDownloadable + ", " + website;
}

public static String init(String name, String version, String developer, String operatingSystem, boolean isFree, int size, String category, boolean isDownloadable, String website, int rating) {
return "Method with 10 parameters: " + name + ", " + version + ", " + developer + ", " + operatingSystem + ", " + isFree + ", " + size + ", " + category + ", " + isDownloadable + ", " + website + ", " + rating;
}
}
