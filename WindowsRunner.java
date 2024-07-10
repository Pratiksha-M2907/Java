public class WindowsRunner {
public static void main(String[] args) {
System.out.println(Windows.init());
System.out.println(Windows.init("Windows 10"));
System.out.println(Windows.init("Windows 10", "x64"));
System.out.println(Windows.init("Windows 10", "x64", 8));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060"));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true, "Intel Core i7"));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true, "Intel Core i7", 512));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true, "Intel Core i7", 512, "Windows 10 Pro"));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true, "Intel Core i7", 512, "Windows 10 Pro", true));
System.out.println(Windows.init("Windows 10", "x64", 8, "NVIDIA GeForce GTX 1060", true, "Intel Core i7", 512, "Windows 10 Pro", true, 2));
}
}
