

public class Instagram {
public static String init() {
return "Method with 0 parameters";
}

public static String init(String username) {
return "Method with 1 parameter: " + username;
}

public static String init(String username, String password) {
return "Method with 2 parameters: " + username + ", " + password;
}

public static String init(String username, String password, String email) {
return "Method with 3 parameters: " + username + ", " + password + ", " + email;
}

public static String init(String username, String password, String email, String profilePicture) {
return "Method with 4 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture;
}

public static String init(String username, String password, String email, String profilePicture, String bio) {
return "Method with 5 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio;
}

public static String init(String username, String password, String email, String profilePicture, String bio, int followers) {
return "Method with 6 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio + ", " + followers;
}

public static String init(String username, String password, String email, String profilePicture, String bio, int followers, int following) {
return "Method with 7 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio + ", " + followers + ", " + following;
}

public static String init(String username, String password, String email, String profilePicture, String bio, int followers, int following, String accountType) {
return "Method with 8 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio + ", " + followers + ", " + following + ", " + accountType;
}

public static String init(String username, String password, String email, String profilePicture, String bio, int followers, int following, String accountType, boolean isVerified) {
return "Method with 9 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio + ", " + followers + ", " + following + ", " + accountType + ", " + isVerified;
}

public static String init(String username, String password, String email, String profilePicture, String bio, int followers, int following, String accountType, boolean isVerified, boolean isPrivate) {
return "Method with 10 parameters: " + username + ", " + password + ", " + email + ", " + profilePicture + ", " + bio + ", " + followers + ", " + following + ", " + accountType + ", " + isVerified + ", " + isPrivate;
}
}

