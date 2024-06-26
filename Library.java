class Library {
	public static void main(String args[]){
    String[] names = {"Central Library", "Community Library", "City Library"};
    int[] floors = {3, 2, 4};
    long[] books = {30000L, 20000L, 40000L};
    char[] codes = {'C', 'M', 'T'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Library names: " + names[s]);
        System.out.println("Library floors: " + floors[s]);
        System.out.println("Library books: " + books[s]);
        System.out.println("Library codes: " + codes[s]);
		System.out.println("\n");
    }
}
}