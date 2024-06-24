class Exam{
	static float mathsMarks=94.5f;
    static float scienceMarks=87.5f;
	static float englishMarks=92.00f;
	static float historyMarks=90.00f;
	static float geographyMarks=75.00f;
 public static void main(String args[]){
 
        System.out.println("Maths:"+mathsMarks);
        System.out.println("Science:"+scienceMarks);
        System.out.println("English: " +englishMarks);
        System.out.println("History: " +historyMarks);
        System.out.println("Geography:" +geographyMarks);
		float TotalMarks= mathsMarks+scienceMarks+englishMarks+historyMarks+geographyMarks;
 System.out.println("TotalMarks:" +TotalMarks);
 }

}