public class StringRunner {
    public static void main(String[] args) {
        System.out.println("Accessing the array from StringHolder class:");
        for (int num=0; num<StringHolder.myString.length; num++) {
            System.out.print(StringHolder.myString[num]);
			System.out.print(" ");
        }
    }
}