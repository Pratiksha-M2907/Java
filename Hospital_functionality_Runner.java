public class Hospital_functionality_Runner{
public static void main(String[] args)
{
	System.out.println("\n----------Hospital Functionality----------\n");
Hospital_functionality.patientVerify("Sakshi K","B1545");
Hospital_functionality.ageGroupClassification("B1545",32);
Hospital_functionality.admitPatient("B1568","Sneha H",16,"26/06/2024");
Hospital_functionality.dischargePatient("B1568","30/06/2024","Good");
Hospital_functionality.calculateBillAmount("B1568",12000.68f,3);
}
}