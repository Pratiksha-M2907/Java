 public class OnlineCourse{
  static double cost = 12000;
  static byte percentageGst=18;
  public static void main(String[] args) {
	double gstamount=cost * percentageGst/100;
	double totalFee=cost+gstamount;
    System.out.println("Course Cost: Rs." + cost);
    System.out.println("GST is " + percentageGst);
    System.out.println("Total Fee (including GST): Rs." + totalFee);
  }
}