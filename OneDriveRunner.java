

public class OneDriveRunner {
public static void main(String[] args) {
System.out.println(OneDrive.init());
System.out.println(OneDrive.init("Personal"));
System.out.println(OneDrive.init("Personal", "1TB"));
System.out.println(OneDrive.init("Personal", "1TB", 100));
System.out.println(OneDrive.init("Personal", "1TB", 100, true));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud"));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud", 1000));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud", 1000, "Windows"));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud", 1000, "Windows", true));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud", 1000, "Windows", true, 60));
System.out.println(OneDrive.init("Personal", "1TB", 100, true, "Cloud", 1000, "Windows", true, 60, "Desktop"));
}
}