
public  class Rain {
  public static void rainIntensity(int intensity) {
    if (intensity >= 100) {
      System.out.println("Heavy rain!");
    } else if (intensity >= 50) {
      System.out.println("Moderate rain!");
    } else if (intensity >= 20) {
      System.out.println("Light rain!");
    } 
  }

  public static void rainForecast(String forecast) {
    if (forecast.equals("Sunny")) {
      System.out.println("No rain expected!");
    } else if (forecast.equals("Cloudy")) {
      System.out.println("Rain possible!");
    } else if (forecast.equals("Rainy")) {
      System.out.println("Rain likely!");
    } 
  }

  public static void rainSound(String sound) {
    if (sound.equals("Droplets")) {
      System.out.println("Rain sounds like droplets on the roof!");
    } else if (sound.equals("Drizzle")) {
      System.out.println("Rain sounds like a gentle drizzle!");
    } else if (sound.equals("Downpour")) {
      System.out.println("Rain sounds like a heavy downpour!");
    } 
  }

  public static void rainEffect(String effect) {
    if (effect.equals("Calm")) {
      System.out.println("Rain has a calming effect!");
    } else if (effect.equals("Refreshing")) {
      System.out.println("Rain is refreshing!");
    } else if (effect.equals("Disruptive")) {
      System.out.println("Rain is disruptive!");
    }
  }
}
