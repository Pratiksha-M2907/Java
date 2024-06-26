class Students {
	public static void main(String[] args) {
    String[] names = {"Pratiksha", "Shashi", "Samruddhi","Sachin"};
    int[] ages = {22, 22, 21,23};
    long[] ids = {051, 424, 92,94};
    char[] div = {'A', 'B', 'B','B'};
	for (int s=0; s<names.length; s++) {
            System.out.println(" Student Name: "+names[s]);
			System.out.println(" Age: "+ages[s]);
			System.out.println(" Id is: "+ids[s]);
			System.out.println(" Division: "+div[s]);
			System.out.println("\n");
			
        }
	}
}