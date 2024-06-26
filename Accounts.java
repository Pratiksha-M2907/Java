class Accounts {
	public static void main(String args[]){
    String[] names = {"Pratiksha", "Shweta", "Nikita"};
    int[] accountNumbers = {123, 456, 789};
    long[] balances = {1000L, 2000L, 3000L};
    char[] types = {'S', 'C', 'S'};

    for (int s=0; s<names.length; s++) {
        System.out.println("Account Name " + names[s]);
        System.out.println("Account Number: " + accountNumbers[s]);
        System.out.println("Balance: " + balances[s]);
        System.out.println("Account Type: " + types[s]);
		System.out.println("\n");
    }
}
}