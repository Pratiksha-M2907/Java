public class BankAccounts{
	public static String bankName = "SBI Bank";
    public static String bankAddress = "BTM Layout, Layout";
    public static String accountNumber;
    public static String accountHolderName;
    public static String accountType;
    public static double balance;
    public static double interestRate = 0.05;
    public static double minimumBalance = 1000;
    public static double overdraftLimit;
	public static String branchCode;
    public static String branchAddress;
    public static boolean isActive;
    public static String phoneNumber;
    public static String email;

     public static void BankAccount(String accountNumber, String accountHolderName, double balance) {
        BankAccount.accountNumber = accountNumber;
        BankAccount.accountHolderName = accountHolderName;
        BankAccount.balance = balance;
        BankAccount.accountType = "Savings";
        BankAccount.branchCode = "BR123";
        BankAccount.branchAddress = "BTM 2nd stage Branch, Bangalore";
        BankAccount.isActive = true;
        BankAccount.interestRate = 2.5;
        BankAccount.phoneNumber = "123-456-7890";
        BankAccount.email = "pratiksha@gmail.com";
    }
     public static void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Bank Address: " + bankAddress);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("Branch Address: " + branchAddress);
        System.out.println("Active: " + isActive);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}