public class Calculate {
  
  public static void addNumbers(int num1, int num2) {
    int sum=0;
    sum=num1 + num2;
	System.out.println("Addition Result is: "+sum);
  }

  public static void subtractNumbers(int num1, int num2) {
    int res=0;
    res=num1-num2;
	System.out.println("Substraction Result is: "+res);
  }

  public static void multiplyNumbers(int num1, int num2) {
    int mul=0;
    mul=num1 * num2;
	System.out.println("Product is: "+mul);
  }

  public static void divideNumbers(int num1, int num2) {
    if (num2 == 0) {
      System.out.println("Cannot divide by zero!");
	}
    else{
	    float div=0;
        div=num1/num2;
	    System.out.println("Division Result is: "+div);
	}
  }

  public static void calculateModulus(int num1, int num2) {
    int mod;
    mod=num1%num2;
	System.out.println("Modulus is: "+mod);
  }
}
