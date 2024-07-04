public class PhonepayRunner{
public static void main(String args[]){
System.out.println("Welcome! Pay in seconds using phonepay");
Phonepay.mode(" ","Scan QR", "To mobile no.", "To self account", "Check balence");
Phonepay.amount(6546);
Phonepay.paymentstatus();
Phonepay.phno();
}
}