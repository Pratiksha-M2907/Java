public class Teacher {
	public static void main(String args[]){
    String[] names = {"Prof. Arpita Patil", "Prof. Shivanand Patil", "Prof. Sushila Vantmuri"};
    int[] ages = {40, 45, 50};
    long[] ids = {2001L, 2002L, 2003L};
    char[] classTeacherOf = {'A', 'B', 'C'};
    for (int s=0; s<names.length; s++) {
        System.out.println("Teacher name: " + names[s]);
        System.out.println("Teacher age: " + ages[s]);
        System.out.println("Teacher ids: " + ids[s]);
        System.out.println(names[s]+"is Class Teacher of: " + classTeacherOf[s]);
		System.out.println("\n");
    }
	}
}