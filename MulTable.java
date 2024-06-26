public class MulTable {
    public static void main(String[] args) {
        int num = 2;
		System.out.println("Multiplication Table of "+num+" is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n"+num + " * " + i + " = " + (num * i ));
			System.out.print("____________");
			System.out.println("");
        }
    }
}