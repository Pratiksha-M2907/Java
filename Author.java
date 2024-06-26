class Author {
	public static void main(String args[]){
    String[] names = {"Sudha Murty", "Chetan Bhagat", "Charles Dickens"};
    int[] ages = {75, 65, 60};
    long[] books = {20L, 15L, 25L};
    char[] ratings = {'A', 'B', 'A'};

    for (int s=0; s<names.length; s++) {
        System.out.println(" Author name: " + names[s]);
        System.out.println(" Author Age: " + ages[s]);
        System.out.println(" books: " + books[s]);
        System.out.println(" ratings: " + ratings[s]);
		System.out.println("\n");
    }
}
}