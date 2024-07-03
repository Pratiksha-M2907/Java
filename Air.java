
public class Air {

  public static void checkAirTemperature(int temperature) {
    if (temperature >= 80) {
      System.out.println("Air is hot.");
    } else if (temperature >= 60) {
      System.out.println("Air is warm.");
    } else if (temperature >= 40) {
      System.out.println("Air is cool.");
    } 
  }

  public  static void checkAirHumidity(int humidity) {
    if (humidity >= 80) {
      System.out.println("Air is very humid.");
    } else if (humidity >= 60) {
      System.out.println("Air is humid.");
    } else if (humidity >= 40) {
      System.out.println("Air is comfortable.");
    } 
  }

  public static  void checkAirPressure(int pressure) {
    if (pressure >= 100) {
      System.out.println("Air pressure is high.");
    } else if (pressure >= 50) {
      System.out.println("Air pressure is moderate.");
    } else if (pressure>=25) {
      System.out.println("Air pressure is low.");
    }
  }
  public static void checkAirQuality(String quality) {
    if (quality.equals("Excellent")) {
      System.out.println("Air is fresh and clean.");
    } else if (quality.equals("Good")) {
      System.out.println("Air is acceptable for breathing.");
    } else if (quality.equals("Fair")) {
      System.out.println("Air needs purification.");
    } 
  }
}