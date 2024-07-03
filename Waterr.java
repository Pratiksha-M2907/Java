public class Waterr {
  public static void boilWater(int temperature) {
    if (temperature >= 100) {
      System.out.println("Water is boiling!");
    } else if (temperature >= 90) {
      System.out.println("Water is hot!");
    } else {
      System.out.println("Water is not hot enough.");
    }
  }

  public static void addIceCubes(int numIceCubes) {
    if (numIceCubes >= 5) {
      System.out.println("Added a lot of ice cubes to the water!");
    } else if (numIceCubes >= 2) {
      System.out.println("Added a few ice cubes to the water.");
    } else {
      System.out.println("Added only one ice cube to the water.");
    }
  }

  public static  void filterWater(String filterType) {
    if (filterType.equals("Brita")) {
      System.out.println("Filtered water using Brita filter.");
    } else if (filterType.equals("Pur")) {
      System.out.println("Filtered water using Pur filter.");
    } else {
      System.out.println("Unknown filter type.");
    }
  }

  public static void addFlavoring(String flavor) {
    if (flavor.equals("Lemon")) {
      System.out.println("Added lemon flavor to the water.");
    } else if (flavor.equals("Mint")) {
      System.out.println("Added mint flavor to the water.");
    } else {
      System.out.println("Unknown flavor.");
    }
  }
}