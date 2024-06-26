class Store {
	public static void main(String args[]){
    String[] names = {"Walmart", "Target", "Costco"};
    int[] employeeCount = {100, 150, 200};
    long[] revenue = {1000000L, 1500000L, 2000000L};
    char[] ratings = {'A', 'B', 'A'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Store name: " + names[s]);
        System.out.println("No. of Employees: " + employeeCount[s]);
        System.out.println("Revenue: " + revenue[s]);
        System.out.println("Ratings: " + ratings[s]);
		System.out.println("\n");
    }
}
}