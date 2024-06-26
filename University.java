class University {
	public static void main(String args[]){
    String[] names = {"Harvard", "MIT", "VTU"};
    int[] rankings = {1, 2, 3};
    long[] enrollments = {20000L, 10000L, 15000L};
    char[] codes = {'H', 'M', 'V'};


    for (int s=0; s<names.length; s++) {
        System.out.println("University names: " + names[s]);
        System.out.println("University rankings: " + rankings[s]);
        System.out.println("University enrollments: " + rankings[s]);
        System.out.println("University codes: " + codes[s]);
		System.out.println("\n");
    }
}
}