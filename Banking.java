public class Banking {
	  public static String transactionType="deposit";
	  public static String transactionStatus="Pending";
	  public static float transactionAmount=2655.68f;
	  public static float accountBalance=56000.59f;
	  public static int customerAge=22;
	  public static float previousBalance;
	  public static String customerName ="Pratiksha M";
	  public static String customerAddress="Belagavi";
	  public static long customerPhone=9845985998l;
	  public static long customerAccountNo=986625526526665l;
	  
  public static void checkAccountBalance() {
    if (accountBalance >= 12000) {
      System.out.println(customerName+" Your Account has sufficient Balence Rs. "+accountBalance);
    }
    else if (accountBalance < 1000) {
      System.out.println("Balence is at minimum limit!");
    }
    else if (accountBalance == 0) {
      System.out.println("Please credit some amount.\nPenalty charge gets levied by the bank if you have no balance in your savings accountBank \n");
    }
    if (accountBalance > 500000) {
      System.out.println("Balance is above a level set.\nHigh account balance alert!!\n");
    }
    if (accountBalance != previousBalance) {
      System.out.println("Check ur updated balence!!");
    }
  }

  public static void processTransaction() {
	 
    if (transactionAmount > 0) {
      System.out.println(customerName+" Your Transaction amount is valid");
    }
    else if (transactionAmount > accountBalance) {
      System.out.println(" You have Insufficient balence!!");
    }
    else if (transactionType=="withdrawal") {
      System.out.println("Processing withdrawal");
    }
    else if (transactionType=="deposit") {
      System.out.println("Processing deposit");
    }
    else if (transactionStatus == "pending") {
      System.out.println("Transaction is pending");
    }
  }

  public static void verifyCustomerDetails() {
    if (customerAge >= 18) {
      System.out.println("Customer is an adult");
    }
    else if (customerName=="Pratiksha M") {
      System.out.println("Customer "+customerName+" is verified");
    }
    else if (customerAddress=="Belagavi") {
      System.out.println("Customer lives in "+customerAddress);
    }
    if (customerPhone ==9845985998l ) {
      System.out.println("Customer phone number is valid");
    }
    if (customerAccountNo==986625526526665l){
      System.out.println("Account no is verified!");
    }
  }
  public static void main(String[] args){
	  System.out.println("\n______Banking_______\n");
	  checkAccountBalance();
	  processTransaction();
	  verifyCustomerDetails();
	  
  }
}
