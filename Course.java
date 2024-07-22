//Constructor Chaining
public class Course{
	public static String cName;
	public static int fees;
	public static String paymentStatus;
	public static String collegeName;
	public static int yearOfJoin;
	public static int yearOfPassOut;
	public static String typeOfAdmission;
	
	public Course(){
		System.out.println("Course Details");
	}
	
	public Course(String cName){
		this(cName,fees);
		this.cName=cName;
	}
	public Course(String cName,int fees){
		this(cName,fees,paymentStatus);
		this.cName=cName;
		this.fees=fees;
	}
	public Course(String cName,int fees,String paymentStatus){
		this(cName,fees,paymentStatus,collegeName);
		this.cName=cName;
		this.fees=fees;
		this.paymentStatus=paymentStatus;
	}
	public Course(String cName,int fees,String paymentStatus,String collegeName){
		this(cName,fees,paymentStatus,collegeName,yearOfJoin);
		this.cName=cName;
		this.fees=fees;
		this.paymentStatus=paymentStatus;
		this.collegeName=collegeName;
	}
	public Course(String cName,int fees,String paymentStatus,String collegeName,int yearOfJoin){
		this(cName,fees,paymentStatus,collegeName,yearOfJoin,yearOfPassOut);
		this.cName=cName;
		this.fees=fees;
		this.paymentStatus=paymentStatus;
		this.collegeName=collegeName;
		this.yearOfJoin=yearOfJoin;
	}
	public Course(String cName,int fees,String paymentStatus,String collegeName,int yearOfJoin,int yearOfPassOut){
		this(cName,fees,paymentStatus,collegeName,yearOfJoin,yearOfPassOut,typeOfAdmission);
		this.cName=cName;
		this.fees=fees;
		this.paymentStatus=paymentStatus;
		this.collegeName=collegeName;
		this.yearOfJoin=yearOfJoin;
		this.yearOfPassOut=yearOfPassOut;
	}
	public Course(String cName,int fees,String paymentStatus,String collegeName,int yearOfJoin,int yearOfPassOut,String typeOfAdmission){
		this.cName=cName;
		this.fees=fees;
		this.paymentStatus=paymentStatus;
		this.collegeName=collegeName;
		this.yearOfJoin=yearOfJoin;
		this.yearOfPassOut=yearOfPassOut;
		this.typeOfAdmission=typeOfAdmission;
		System.out.println("Course: "+cName);
		System.out.println("Annual Fee: "+fees);
		System.out.println("Payment: "+paymentStatus);
		System.out.println("College: "+collegeName);
		System.out.println("Year of Join is: "+yearOfJoin);
		System.out.println("Year of Passout is: "+yearOfPassOut);
		System.out.println("Type of Admission: "+typeOfAdmission+"\n");
	}
	public static void main(String args[]){
		Course c= new Course();
		Course c1= new Course("Computer Science and Engineering",83000,"Successful","S.G.B.I.T",2020,2024,"KCET");
	}
	
}