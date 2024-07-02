public class Metr_o{
    public static void displayTicketPrice(String from, String to) {
        if (from == "Bhanashankari" && to == "BTM") {
            System.out.println("Ticket Price: Rs. 25");
        } else {
            System.out.println("Ticket Price: Rs. 50");
        }
    }
	    public static void checkCardBalance(int cardBalance, int ticketPrice) {
			if (cardBalance >= ticketPrice){
			System.out.println("Card Balecce is: "+cardBalance+" Can Proceed Payment!");
			int newBalance = cardBalance - ticketPrice;
            System.out.println("Transaction successful!"+"\n Your Card Balance is: Rs. " + newBalance);
			}
  
    }
}