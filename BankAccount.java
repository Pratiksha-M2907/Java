public class BankAccount{
    public static String accountHolderName="Pratiksha Maradimath";
	public static double interest=0.7;
	public static long accountNumber=7876546574254l;
	
    
    public static void getAccountHolderNameVerify(String name){
	if (name=="Pratiksha Maradimath"){
	 System.out.println("Account holder "+name+ " is verified");
	}
	else{
	    System.out.println("Please enter a valid name");
	}
	}
	
	public static void getAccountNumberVerify(long accountNum){
	if (accountNum==7876546574254l)
	 System.out.println("Account Number "+accountNum+ " is verified");
	else
	    System.out.println("Please enter correct Account No.");
	}
	
	public static void getBalence(float initialBalance) {
    Double totalbalance = initialBalance+(0.7*initialBalance);
	System.out.println("Account Holder is: "+accountHolderName);
	System.out.println("Total Balence is"+totalbalance);
  }
    
    public static void depositAmountBal(float depAmount, float balence){
	System.out.println("Deposit Amount is: "+depAmount);
	float final_Bal=depAmount+balence;
	System.out.println("Total Amount Balence in Account after Deposit is: "+final_Bal);
	}
    public static void withdrawAmount(float withAmount, float amt){
		System.out.println("Amount in Account before withdrawal is: "+amt);
		float bal=amt-withAmount;
		System.out.println("Amount left in Account after Withdrawal is: "+bal);
	}
}