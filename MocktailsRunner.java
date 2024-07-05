public class MocktailsRunner {
    public static void main(String[] args) {
        Mocktails.Enjoy();
        Mocktails.Menu(" ","Ginger Lime fizz", "Cranberry Lime Sparker", "Kombucha", "Pomogranate Martini","Fresh Berry Spiritizer");
        System.out.println(Mocktails.GetMocktailCount());
        Mocktails.GetMocktailDetails(1);
    }
}

