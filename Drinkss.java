public class Drinkss {
  public static void makeSmoothie(int fruit, int yogurt, String milk) {
    if (fruit == 2) {
      System.out.println("Just right amount of fruit!");
    } else if (yogurt == 1) {
      System.out.println("Just right amount of yogurt!");
    } else if (milk.equals("Almond milk")) {
      System.out.println("Smoothie made with Almond milk");
    }
  }

  public static void makeMilkshake(int iceCream, int syrup, String topping) {
    if (iceCream == 2) {
      System.out.println("Just right amount of ice cream!");
    } else if (syrup == 1) {
      System.out.println("Just right amount of syrup!");
    } else if (topping.equals("Whipped cream")) {
      System.out.println("Milkshake made with Whipped cream topping");
    }
  }

  public static void makeFrappuccino(int coffee, int milk, String flavor) {
    if (coffee == 1) {
      System.out.println("Just right amount of coffee!");
    } else if (milk == 2) {
      System.out.println("Just right amount of milk!");
    } else if (flavor.equals("Caramel")) {
      System.out.println("Frappuccino made with Caramel flavor");
    }
  }

  public static void makeIcedTea(int teaBags, int ice, String sweetener) {
    if (teaBags == 1) {
      System.out.println("Just right amount of tea bags!");
    } else if (ice == 3) {
      System.out.println("Just right amount of ice!");
    } else if (sweetener.equals("Honey")) {
      System.out.println("Iced tea made with Honey sweetener");
    }
  }
}
