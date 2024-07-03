public class CameraRunner{
    public static void main(String[] args) {
        
        System.out.println("Camera Resolution:"+Camera.getResolution());
        System.out.println("Camera Name:"+Camera.getCameraName());
        System.out.println("Aperture:"+Camera.getAperture());
        System.out.println("Flash Available:"+Camera.isFlashAvailable());
        System.out.println("Camera Mode:"+Camera.getCameraMode());
        System.out.println("Battery Level:"+Camera.getBatteryLevel());
        System.out.println("StorageSpace:"+Camera.getStorageSpace());
        System.out.println("Serial Number:"+Camera.getSerialNumber());
        System.out.println("Focal Length:"+Camera.getFocalLength());
    }
}
