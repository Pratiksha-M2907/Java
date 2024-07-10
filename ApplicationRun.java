

public class ApplicationRun {
public static void main(String[] args) {
System.out.println(ApplicationR.init());
System.out.println(ApplicationR.init("MyApp"));
System.out.println(ApplicationR.init("MyApp", "1.0"));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe"));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows"));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true, 100));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity"));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true, "(link unavailable)"));
System.out.println(ApplicationR.init("MyApp", "1.0", "John Doe", "Windows", true, 100, "Productivity", true, "(link unavailable)", 5));
}
}