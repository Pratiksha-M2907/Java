public class Hospital_functionality {
public static String patientName="Sakshi K";
public static String patientid="B1545";

public static void patientVerify(String name,String patientid){
	if (name=="Sakshi K" && patientid=="B1545"){
	 System.out.println("Patient "+name+ " is verified\n");
	}
	else{
	    System.out.println("You have entered a wroung patient Name or ID, Please check!!\n");
	}
	}
public static void ageGroupClassification(String patientId, int age) {
    if(age>0 && age<=2){
	System.out.println("Patient is "+age+" old, a Baby, Visit Pediatrician\n");}
	else if(age>3 && age<=14){
		System.out.println("Patient is "+age+" years old,Visit Child Specialist\n");
	}
	else if(age>14){
		System.out.println("Patient is "+age+" years old,Visit Physician\n");
	}	
	}
public static void admitPatient(String patientId, String name, int age, String date) {
	if(age>0 && age<=2){
	System.out.println("Patient "+name+" id "+patientId+" is admitted Pediatric Section\n");
	System.out.println("Admit Date: "+date);
	}
	else if(age>3 && age<=14){
	System.out.println("Patient "+name+" id "+patientId+" is admitted Child Specialization Section\n");
	System.out.println("Admit Date: "+date);
	}
	else if(age>14){
	System.out.println("Patient "+name+" id "+patientId+" is admitted to General section\n");
	System.out.println("Admit Date: "+date);
	}
	
  }
  public static void dischargePatient(String patientId, String dischargeDate, String patient_Condition){
	  if(patient_Condition=="Good")
	  {
		  System.out.println("Patient No."+patientId+" can be Discharged on "+dischargeDate);
	  }
	  else
	  {
		  System.out.println("Patient No."+patientId+" can't be discharged yet.\n");
	  }   
  }
public static void calculateBillAmount(String patientId, float amount, int no_of_days) {
	System.out.println("Bill Amount per day is: "+amount+" Rs\n");
	System.out.println("No of days admitted: "+no_of_days);
	float total_Bill= no_of_days*amount;
	System.out.println("Total Bill is "+total_Bill+" Rs\n");
}
}
	
	
	
  