class Course {
public static void main(String args[]){
    String[] titles = {"Math", "Science", "History"};
    int[] credits = {3, 4, 2};
    long[] codes = {3001L, 3002L, 3003L};
    char[] sections = {'A', 'B', 'C'};
    for (int s=0; s<titles.length; s++) {
        System.out.println("Course titles: " + titles[s]);
        System.out.println("Course credits: " + credits[s]);
        System.out.println("Course codes: " + codes[s]);
        System.out.println("Course sections: " + sections[s]);
		System.out.println("\n");
    }
}
}