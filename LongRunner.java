public class LongRunner {
    public static void main(String[] args) {
        System.out.println("Accessing the array from LongHolder class:");
        for (int num=0; num<LongHolder.longArray.length; num++) {
            System.out.print(LongHolder.longArray[num]);
			System.out.print(" ");
        }
    }
}