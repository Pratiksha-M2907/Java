public class JobApplicationEligibilityRunner{
public static void main(String []args){
	JobApplicationEligibility j1=new JobApplicationEligibility();
	String[] skills={"Java","HTML","CSS","JS","MySQL"};
	JobApplicationEligibility j2=new JobApplicationEligibility("Shweta", 23,"B.E",70.25,skills,"Bangalore","Java Developer");
	j2.checkAgeEligibility(23);
	j2.checkSoftwareJobEligibility(23,"B.E");
	j2.checkJavaDeveloperEligibility(skills);
	j2.checkSoftwareDeveloperEligibility(70.25,"B.E");
	
	
}

}