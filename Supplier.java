class Supplier {
	public static void main(String args[]){
    String[] names = {"Supplier A", "Supplier B", "Supplier C"};
    long[] contactNumbers = {1234567890L, 987654321L, 1122334455L};
    int[] supplyIds = {1, 2, 3};
    char[] ratings = {'A', 'B', 'C'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Supplier name: " + names[s]);
        System.out.println("Supplier ContactNumber: " + contactNumbers[s]);
        System.out.println("Supplier Id: " + supplyIds[s]);
        System.out.println("Ratings: " + ratings[s]);
		System.out.println("\n");
    }
}
}