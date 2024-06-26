class Transaction {
	public static void main(String args[]){
	String[] transactionIds = {"TXN001", "TXN002", "TXN003"};
    int[] amounts = {100, 200, 300};
    long[] timestamps = {1620000000L, 1620000100L, 1620000200L};
    char[] statuses = {'S', 'F', 'P'};

    for (int s=0; s<transactionIds.length; s++) {
        System.out.println("TransactionId: " + transactionIds[s]);
        System.out.println("Amount: " + amounts[s]);
        System.out.println("Timestamp: " + timestamps[s]);
        System.out.println("Status: " + statuses[s]);
		System.out.println("\n");
    }
}
}