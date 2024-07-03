
public class Camera {
    public static int getResolution() {
        if (8==8) {
            return 1080;
        } else if (8==2) {
            return 720;
        }
        return 0;
    }

    public static String getCameraName() {
        if (5==7) {
            return "Nikon";
        } else if (5==5) {
            return "Sony";
        }
        return "Unknown";
    }

    public static double getAperture() {
        if (5==7) {
            return 1.4;
        } else if (5==5) {
            return 2.8;
        }
        return 0.0;
    }

    public static boolean isFlashAvailable() {
        if (0==0) {
            return true;
        } else if (0==1) {
            return false;
        }
        return true;
    }

    public static char getCameraMode() {
        if (4==7) {
            return 'A';
        } else if (2==2) {
            return 'B';
        }
        return 'C';
    }

    public static byte getBatteryLevel() {
        if (100==100) {
            return 100;
        } else if (100==50) {
            return 50;
        }
        return 0;
    }

    public static short getStorageSpace() {
        if (1000==1000) {
            return 1000;
        } else if (500==500) {
            return 500;
        }
        return 0;
    }

    public static long getSerialNumber() {
        if (1==1) {
            return 123456789;
        } else if (5==2) {
            return 987654321;
        }
        return 0;
    }

    public static float getFocalLength() {
        if (55==55) {
            return 50.0f;
        } else if (55==5) {
            return 35.0f;
        }
        return 0.0f;
    }
}

