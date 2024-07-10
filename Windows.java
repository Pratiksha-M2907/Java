class Windows {
public static String init() {
return "Method with 0 parameters";
}

public static String init(String version) {
return "Method with 1 parameter: " + version;
}

public static String init(String version, String architecture) {
return "Method with 2 parameters: " + version + ", " + architecture;
}

public static String init(String version, String architecture, int memory) {
return "Method with 3 parameters: " + version + ", " + architecture + ", " + memory;
}

public static String init(String version, String architecture, int memory, String graphicsCard) {
return "Method with 4 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop) {
return "Method with 5 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop, String processor) {
return "Method with 6 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop + ", " + processor;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop, String processor, int storage) {
return "Method with 7 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop + ", " + processor + ", " + storage;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop, String processor, int storage, String operatingSystem) {
return "Method with 8 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop + ", " + processor + ", " + storage + ", " + operatingSystem;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop, String processor, int storage, String operatingSystem, boolean isGamingPC) {
return "Method with 9 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop + ", " + processor + ", " + storage + ", " + operatingSystem + ", " + isGamingPC;
}

public static String init(String version, String architecture, int memory, String graphicsCard, boolean isLaptop, String processor, int storage, String operatingSystem, boolean isGamingPC, int weight) {
return "Method with 10 parameters: " + version + ", " + architecture + ", " + memory + ", " + graphicsCard + ", " + isLaptop + ", " + processor + ", " + storage + ", " + operatingSystem + ", " + isGamingPC + ", " + weight;
}
}

