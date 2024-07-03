public class ClothnewRunner {
    public static void main(String[] args) {
        Cloth.setThreadCount(100);
        Cloth.setFabricType("Cotton");
        Cloth.setWaterAbsorption(0.8);
        Cloth.setStainResistant(true);
    }
}