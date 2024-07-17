public class LibraryDetailsRunner {
    public static void main(String[] args) {
		
		LibraryDetails library1 = new LibraryDetails(new String[]{"Black Beauty", "Anne Frank"}, 10, 500.0f, "K.L.E School,Nipani", (short) 5, true);
        LibraryDetails library2 = new LibraryDetails(new String[]{"Horticulture the art", "Thousand stiches of life"}, 15, 750.0f, "G.I.B Clg, Nipani", (short) 6, false);
        LibraryDetails library3 = new LibraryDetails(new String[]{"Analog and Digital works", "C and C++ things"}, 12, 600.0f, "S.G.B.I.T Library,Belagavi", (short) 5, true);
        LibraryDetails library4 = new LibraryDetails(new String[]{"The art of life", "Sleeping Beauty"}, 18, 900.0f, "B.T.M Bangalore", (short) 7, false);

        library1.display();
        library2.display();
        library3.display();
        library4.display();
    }
}