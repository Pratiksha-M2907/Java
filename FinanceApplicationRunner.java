public class FinanceApplicationRunner{
    public static void main(String[] args) {
        FinanceApplication[] f = new FinanceApplication[18];

        for (int i = 0; i < 18; i++) {
            f[i] = new FinanceApplication();
        }

        for (int i = 0; i < 18; i++) {
            f[0].accountHolderName = "Akshata";
            f[0].accountNumber = 1000 + i;
            f[0].balance = 2000 * i;
            f[0].monthlyDeposit = 200.0 * i;
            f[0].monthlyWithdrawal = 150.0 * i;
            f[0].loanAmount = 5000.0 * i;
            f[0].loanInterestRate = 5.0 + i;
            f[0].loanTerm = 12 * i;
            f[0].accountType ="Savings";
            f[0].accountStatus ="Active";
            f[0].branch = "BTM " + i;
            f[0].contactNumber = "8976435153" + i;
            f[0].email = "akshata@financeapp.com";

            f[1].accountHolderName = "Anu";
            f[1].accountNumber = 1000 + i;
            f[1].balance = 2000 * i;
            f[1].monthlyDeposit = 200.0 * i;
            f[1].monthlyWithdrawal = 150.0 * i;
            f[1].loanAmount = 5500.0 * i;
            f[1].loanInterestRate = 5.0 + i;
            f[1].loanTerm = 12 * i;
            f[1].accountType ="Savings";
            f[1].accountStatus ="InActive";
            f[1].branch = "BTM " + i;
            f[1].contactNumber = "8976435153" + i;
            f[1].email = "anu@financeapp.com";
        
            f[2].accountHolderName = "Aakash";
            f[2].accountNumber = 1000 + i;
            f[2].balance = 2000 * i;
            f[2].monthlyDeposit = 200.0 * i;
            f[2].monthlyWithdrawal = 150.0 * i;
            f[2].loanAmount = 5600.0 * i;
            f[2].loanInterestRate = 5.0 + i;
            f[2].loanTerm = 12 * i;
            f[2].accountType ="Savings";
            f[2].accountStatus ="InActive";
            f[2].branch = "BTM " + i;
            f[2].contactNumber = "8256235153" + i;
            f[2].email = "aakash@financeapp.com";

            f[3].accountHolderName = "Akansha";
            f[3].accountNumber = 2000 + i;
            f[3].balance = 2000 * i;
            f[3].monthlyDeposit = 200.0 * i;
            f[3].monthlyWithdrawal = 150.0 * i;
            f[3].loanAmount = 5500.0 * i;
            f[3].loanInterestRate = 5.0 + i;
            f[3].loanTerm = 12 * i;
            f[3].accountType ="Savings";
            f[3].accountStatus ="Active";
            f[3].branch = "BTM " + i;
            f[3].contactNumber = "9876435153" + i;
            f[3].email = "akansha@financeapp.com";

            f[4].accountHolderName = "Anu";
            f[4].accountNumber = 1000 + i;
            f[4].balance = 2000 * i;
            f[4].monthlyDeposit = 200.0 * i;
            f[4].monthlyWithdrawal = 150.0 * i;
            f[4].loanAmount = 5500.0 * i;
            f[4].loanInterestRate = 5.0 + i;
            f[4].loanTerm = 12 * i;
            f[4].accountType ="Savings";
            f[4].accountStatus ="InActive";
            f[4].branch = "BTM " + i;
            f[4].contactNumber = "8976435153" + i;
            f[4].email = "anu@financeapp.com";

            f[5].accountHolderName = "Anu";
            f[5].accountNumber = 1000 + i;
            f[5].balance = 2000 * i;
            f[5].monthlyDeposit = 200.0 * i;
            f[5].monthlyWithdrawal = 150.0 * i;
            f[5].loanAmount = 5500.0 * i;
            f[5].loanInterestRate = 5.0 + i;
            f[5].loanTerm = 12 * i;
            f[5].accountType ="Savings";
            f[5].accountStatus ="InActive";
            f[5].branch = "BTM " + i;
            f[5].contactNumber = "8976435153" + i;
            f[5].email = "anu@financeapp.com";

            f[6].accountHolderName = "Anushka";
            f[6].accountNumber = 1000 + i;
            f[6].balance = 2000 * i;
            f[6].monthlyDeposit = 200.0 * i;
            f[6].monthlyWithdrawal = 150.0 * i;
            f[6].loanAmount = 0.0 * i;
            f[6].loanInterestRate = 5.0 + i;
            f[6].loanTerm = 12 * i;
            f[6].accountType ="Savings";
            f[6].accountStatus ="InActive";
            f[6].branch = "BTM " + i;
            f[6].contactNumber = "8976435153" + i;
            f[6].email = "anushka@financeapp.com";

            f[7].accountHolderName = "Prerana";
            f[7].accountNumber = 1000 + i;
            f[7].balance = 2000 * i;
            f[7].monthlyDeposit = 200.0 * i;
            f[7].monthlyWithdrawal = 150.0 * i;
            f[7].loanAmount = 10000.0 * i;
            f[7].loanInterestRate = 5.0 + i;
            f[7].loanTerm = 12 * i;
            f[7].accountType ="Savings";
            f[7].accountStatus ="InActive";
            f[7].branch = "BTM " + i;
            f[7].contactNumber = "8976435153" + i;
            f[7].email = "peri@financeapp.com";

            f[8].accountHolderName = "Pranati";
            f[8].accountNumber = 1000 + i;
            f[8].balance = 2000 * i;
            f[8].monthlyDeposit = 200.0 * i;
            f[8].monthlyWithdrawal = 150.0 * i;
            f[8].loanAmount = 6000.0 * i;
            f[8].loanInterestRate = 5.0 + i;
            f[8].loanTerm = 12 * i;
            f[8].accountType ="Savings";
            f[8].accountStatus ="InActive";
            f[8].branch = "BTM " + i;
            f[8].contactNumber = "9324435153" + i;
            f[8].email = "pran@financeapp.com";

            f[9].accountHolderName = "Prashanti";
            f[9].accountNumber = 1000 + i;
            f[9].balance = 2000 * i;
            f[9].monthlyDeposit = 200.0 * i;
            f[9].monthlyWithdrawal = 180.0 * i;
            f[9].loanAmount = 5500.0 * i;
            f[9].loanInterestRate = 5.0 + i;
            f[9].loanTerm = 12 * i;
            f[9].accountType ="Savings";
            f[9].accountStatus ="InActive";
            f[9].branch = "BTM " + i;
            f[9].contactNumber = "9874435153" + i;
            f[9].email = "pra@financeapp.com";

            f[10].accountHolderName = "Sakshi";
            f[10].accountNumber = 1000 + i;
            f[10].balance = 2000 * i;
            f[10].monthlyDeposit = 200.0 * i;
            f[10].monthlyWithdrawal = 150.0 * i;
            f[10].loanAmount = 5500.0 * i;
            f[10].loanInterestRate = 5.0 + i;
            f[10].loanTerm = 12 * i;
            f[10].accountType ="Savings";
            f[10].accountStatus ="InActive";
            f[10].branch = "BTM " + i;
            f[10].contactNumber = "8894535153" + i;
            f[10].email = "anu@financeapp.com";

            f[11].accountHolderName = "Akshay";
            f[11].accountNumber = 1000 + i;
            f[11].balance = 2000 * i;
            f[11].monthlyDeposit = 200.0 * i;
            f[11].monthlyWithdrawal = 150.0 * i;
            f[11].loanAmount = 5500.0 * i;
            f[11].loanInterestRate = 5.0 + i;
            f[11].loanTerm = 12 * i;
            f[11].accountType ="Savings";
            f[11].accountStatus ="InActive";
            f[11].branch = "BTM " + i;
            f[11].contactNumber = "8976547153" + i;
            f[11].email = "aksh@financeapp.com";

            f[12].accountHolderName = "Anup";
            f[12].accountNumber = 1000 + i;
            f[12].balance = 2000 * i;
            f[12].monthlyDeposit = 200.0 * i;
            f[12].monthlyWithdrawal = 250.0 * i;
            f[12].loanAmount = 12000.0 * i;
            f[12].loanInterestRate = 5.0 + i;
            f[12].loanTerm = 12 * i;
            f[12].accountType ="Savings";
            f[12].accountStatus ="InActive";
            f[12].branch = "BTM " + i;
            f[12].contactNumber = "8976698553" + i;
            f[12].email = "anup@financeapp.com";

            f[13].accountHolderName = "Harshita";
            f[13].accountNumber = 1000 + i;
            f[13].balance = 6000 * i;
            f[13].monthlyDeposit = 200.0 * i;
            f[13].monthlyWithdrawal = 150.0 * i;
            f[13].loanAmount = 5500.0 * i;
            f[13].loanInterestRate = 5.0 + i;
            f[13].loanTerm = 12 * i;
            f[13].accountType ="Savings";
            f[13].accountStatus ="InActive";
            f[13].branch = "BTM " + i;
            f[13].contactNumber = "8976435153" + i;
            f[13].email = "harshi@financeapp.com";

            f[14].accountHolderName = "Harsh";
            f[14].accountNumber = 1000 + i;
            f[14].balance = 18000 * i;
            f[14].monthlyDeposit = 200.0 * i;
            f[14].monthlyWithdrawal = 150.0 * i;
            f[14].loanAmount = 5500.0 * i;
            f[14].loanInterestRate = 5.0 + i;
            f[14].loanTerm = 12 * i;
            f[14].accountType ="Savings";
            f[14].accountStatus ="InActive";
            f[14].branch = "BTM " + i;
            f[14].contactNumber = "8976435153" + i;
            f[14].email = "harsh@financeapp.com";

            f[15].accountHolderName = "Isha";
            f[15].accountNumber = 1000 + i;
            f[15].balance = 1500 * i;
            f[15].monthlyDeposit = 200.0 * i;
            f[15].monthlyWithdrawal = 150.0 * i;
            f[15].loanAmount = 5500.0 * i;
            f[15].loanInterestRate = 5.0 + i;
            f[15].loanTerm = 12 * i;
            f[15].accountType ="Savings";
            f[15].accountStatus ="InActive";
            f[15].branch = "BTM " + i;
            f[15].contactNumber = "9976152453" + i;
            f[15].email = "anu@financeapp.com";

            f[16].accountHolderName = "Kirti";
            f[16].accountNumber = 1000 + i;
            f[16].balance = 18000 * i;
            f[16].monthlyDeposit = 200.0 * i;
            f[16].monthlyWithdrawal = 600.0 * i;
            f[16].loanAmount = 5500.0 * i;
            f[16].loanInterestRate = 5.0 + i;
            f[16].loanTerm = 12 * i;
            f[16].accountType ="Savings";
            f[16].accountStatus ="InActive";
            f[16].branch = "BTM " + i;
            f[16].contactNumber = "8976489153" + i;
            f[16].email = "kir@financeapp.com";
			
			f[17].accountHolderName = "Kshama";
            f[17].accountNumber = 1000 + i;
            f[17].balance = 1200 * i;
            f[17].monthlyDeposit = 200.0 * i;
            f[17].monthlyWithdrawal = 200.0 * i;
            f[17].loanAmount = 5500.0 * i;
            f[17].loanInterestRate = 5.0 + i;
            f[17].loanTerm = 12 * i;
            f[17].accountType ="Savings";
            f[17].accountStatus ="InActive";
            f[17].branch = "BTM " + i;
            f[17].contactNumber = "8976437898" + i;
            f[17].email = "kshama@financeapp.com";


        }
		for (int i = 0; i < 18; i++) {
			System.out.println(++i+"\n");
            System.out.println(" Account Holder Name: "+f[i].accountHolderName+" \n");
			System.out.println(" Account Number: "+f[i].accountNumber+" \n");
			System.out.println(" Balence: "+f[i].balance+" \n");
			System.out.println(" Monthly Deposit: "+f[i].monthlyDeposit+" \n");
			System.out.println(" Monthly Withdrawal: "+f[i].monthlyWithdrawal+" \n");
			System.out.println(" Loan Amount: "+f[i].loanAmount+" \n");
			System.out.println(" Loan Interest Rate: "+f[i].loanInterestRate+" \n");
			System.out.println(" Loan Term: "+f[i].loanTerm+" \n");
			System.out.println(" Account Type: "+f[i].accountType+" \n");
			System.out.println(" Account Status: "+f[i].accountStatus+" \n");
			System.out.println(" Branch: "+f[i].branch+" \n");
			System.out.println(" Contact Number: "+f[i].contactNumber+" \n");
			System.out.println(" Email: "+f[i].email+" \n");
			System.out.println(" \n");
        }
		

        System.out.println("Bank Name: "+FinanceApplication.bankName);
        System.out.println("Country: "+FinanceApplication.country);
        System.out.println("Interest Rate: "+FinanceApplication.interestRate);
        System.out.println("Total Accounts: "+FinanceApplication.totalAccounts);
        System.out.println("Total Deposits: "+FinanceApplication.totalDeposits);
        System.out.println("Total Loans: "+FinanceApplication.totalLoans);
        System.out.println("Stock Price: "+FinanceApplication.stockPrice);
        System.out.println("Total Employees: "+FinanceApplication.employees);
        System.out.println("Market Capital: "+FinanceApplication.marketCap);
        System.out.println("CEO: "+FinanceApplication.CEO);
        System.out.println("Currency: "+FinanceApplication.currency);
        System.out.println("Total Branches: "+FinanceApplication.branches);
        System.out.println("Total ATM's: "+FinanceApplication.ATMs);
    }
}