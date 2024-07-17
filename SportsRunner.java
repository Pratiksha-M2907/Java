public class SportsRunner {
    public static void main(String[] args) {
		
		Sports sports1 = new Sports(new String[]{"Ball", "Bat"}, 11, 2.5f, "Stadium", (short) 2, true);
        Sports sports2 = new Sports(new String[]{"Racket", "Shuttle"}, 2, 1.5f, "Court", (short) 2, false);
        Sports sports3 = new Sports(new String[]{"Board", "Pieces"}, 2, 3.0f, "Indoor", (short) 2, true);
        Sports sports4 = new Sports(new String[]{"Helmet", "Pads"}, 11, 2.0f, "Field", (short) 2, true);

        sports1.display();
        sports2.display();
        sports3.display();
        sports4.display();
		}
}