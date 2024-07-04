public class GpayRunner{
public static void main(String args[]){
System.out.println("Welcome! Pay in seconds using Google pay");
Gpay.mode(" ","Scan QR", "To mobile no.", "To self account", "Check balence");
Gpay.amount(8000);
Gpay.paymentstatus();
Gpay.phno();
}
}