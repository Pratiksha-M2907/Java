public class Ifelse{
public static void main(String args[]){
 String name="Pratiksha M";
 long contactNo=4875465486L;
 String email="djkhfjekdhfg@gmail.com";
 int age=22;
 if(name=="Pratiksha M"){
	 System.out.println("WELCOME! "+name+" YOUR VOTE IS PRECIOUS");
 }
 if(contactNo==4875465486L){
	 System.out.println(name+"'s Contact no.Is Registered");
 }
 else{
	 System.out.println(name+"'s Contact no.Is not Registered");
 }
 if(email=="djkhfjekdhfg@gmail.com"){
	 System.out.println(name+"'s email is verified");
 }
 else{
	 System.out.println(name+"'s email is not verified");
 }
 if(age>18){
	 System.out.println(name+" Is eligible to Vote");
 }
 else{
	 System.out.println(name+" Is not eligible to Vote");
 }
 }
}