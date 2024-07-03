public class Clothnew {
    public static void setThreadCount(int threadCount) {
        if (threadCount >= 100) {
          System.out.println("high thread count");
        }
		else if (threadCount >= 50) {
            System.out.println("medium thread count");
        } 
		else {
           System.out.println("low thread count");
        }
    }

    public static void setFabricType(String fabricType) {
        if (fabricType.equals("Cotton")) {
         System.out.println("it is Cotton");
        }
		else if (fabricType.equals("Polyester")) {
            System.out.println(" it is Polyester");
        } 
		else {
            System.out.println("it is unknown");
        }
    }

    public static void setWaterAbsorption(double waterAbsorption) {
        if (waterAbsorption >= 0.8) {
           System.out.println("high water absorption");
        } 
		else if (waterAbsorption >= 0.5) {
            System.out.println("medium absorption");
        }
		else {
           System.out.println("low absorption");
        }
    }

    public static void setStainResistant(boolean stainResistant) {
        if (stainResistant) {
           System.out.println("stain resistance");
        } 
		else if (!stainResistant) {
            System.out.println("not stain resistance");
        } 
		else {
            System.out.println("unknown");
        }
    }
}