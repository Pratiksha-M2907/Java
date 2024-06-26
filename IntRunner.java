public class IntRunner {
    public static void main(String[] args) {
        System.out.println("Accessing the array from ArrayHolder class:");
        for (int num=0; num<ArrayHolder.myArray.length; num++) {
            System.out.print(ArrayHolder.myArray[num]);
			System.out.print(" ");
        }
    }
}