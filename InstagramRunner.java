
public class InstagramRunner {

public static void main(String[] args) {
System.out.println(Instagram.init());
System.out.println(Instagram.init("RahulJain"));
System.out.println(Instagram.init("RahulJain", "password123"));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com"));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg"));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer"));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer", 1000));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer", 1000, 200));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer", 1000, 200, "personal"));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer", 1000, 200, "personal", true));
System.out.println(Instagram.init("RahulJain", "password123", "rahuljain@email.com", "profilePicture.jpg", "Software Engineer", 1000, 200, "personal", true, false));
}
}

