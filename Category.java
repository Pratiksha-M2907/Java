class Category {
	public static void main(String args[]){
    String[] names = {"Electronics", "Clothing", "Groceries"};
    int[] itemCounts = {1000, 2000, 1500};
    long[] categoryIds = {100L, 200L, 300L};
    char[] ratings = {'A', 'B', 'A'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Category name: " + names[s]);
        System.out.println("Category count: " + itemCounts[s]);
        System.out.println("Ids: " + categoryIds[s]);
        System.out.println("Rating: " + ratings[s]);
		System.out.println("\n");
    }
}
}