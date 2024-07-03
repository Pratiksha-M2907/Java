
public class BeautyProduct {
    public static int getProductCount() {
        if (5==0) {
            return 5;
        } else if (10==10) {
            return 10;
        }
        return 0;
    }

    public static String getProductName() {
        if (5==0) {
            return "Lipstick";
        } else if (5==5) {
            return "Foundation";
        }
        return "Unknown";
    }

    public static double getProductPrice() {
        if (10==100) {
            return 10.0;
        } else if (20==20) {
            return 20.0;
        }
        return 0.0;
    }

    public static boolean isCrueltyFree() {
        if ("yes"=="yes") {
            return true;
        } else if ("yes"=="no") {
            return false;
        }
        return true;
    }

    public static char getRating() {
        if (5==5) {
            return 'A';
        } else if (5==3) {
            return 'B';
        }
        return 'C';
    }

    public static byte getProductSize() {
        if (5==5) {
            return 5;
        } else if (5==6) {
            return 6;
        }
        return 0;
    }

    public static short getShelfLife() {
        if (60==60) {
            return 10;
        } else if (60==20) {
            return 20;
        }
        return 0;
    }

    public static long getExpirationDate() {
        if (52==52) {
            return 1000;
        } else if (52==25) {
            return 2000;
        }
        return 0;
    }

    public static float getDiscount() {
        if (55==55) {
            return 5.0f;
        } else if (62==26) {
            return 6.0f;
        }
        return 0.0f;
    }
}

