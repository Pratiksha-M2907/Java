public class JobApplicationEligibility {
    String name;
    int age;
    String qualification;
    double degreePercentage;
    String[] skills;
    String location;
    String jobType;
    boolean isEligible;
	
	public JobApplicationEligibility() {
        System.out.println("---Job Application---\n");
    }
	
	public JobApplicationEligibility(String name, int age, String qualification, double degreePercentage, String[] skills, String location, String jobType) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.degreePercentage = degreePercentage;
        this.skills = skills;
        this.location = location;
        this.jobType = jobType;
        this.isEligible = false;
		System.out.println("Candidate Name: "+name+"\nAge: "+age+"\nQualification: "+qualification+"\nDegree Percentage: "+degreePercentage+"\nSkills: "+skills[0]+"\nJob Location: "+location+"\nJob Type: "+jobType);
    }

	public void checkAgeEligibility(int age) {
        if (age < 18) {
            System.out.println("Not eligible for Job due to age");
        } else {
            System.out.println("Eligible for Job based on age");
        }
    }

	public void checkSoftwareJobEligibility(int age, String qualification) {
        if (age > 21 && qualification=="BE") {
            System.out.println("Eligible for applying Software jobs");
        } else {
            System.out.println("Not eligible for applying Software jobs");
        }
    }

	public void checkJavaDeveloperEligibility(String[] skills) {
        for (String skill : skills) {
            if (qualification=="BE" && skill=="Java") {
                System.out.println("Eligible to apply for Java developer");
                return;
            }
        }
        System.out.println("Not eligible to apply for Java developer");
    }
	
	public void checkSoftwareDeveloperEligibility(double degreePercentage,String qualification) {
        if (degreePercentage > 60 && qualification=="BE") {
            System.out.println("Eligible to apply for Software developer");
        } else {
            System.out.println("Not eligible to apply for Software developer");
        }
    }
}
