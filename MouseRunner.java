public class MouseRunner {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech", "Gaming", 1200, 5, true);
        m1.checkAffordability(1200);
        m1.checkAvailability(true, 5);
        m1.checkGamingMouse("Gaming");
        m1.checkDiscount(1200, 5);
        m1.checkPremium("Logitech");
    }
}
