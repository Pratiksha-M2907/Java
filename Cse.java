public class Cse{
public static void main(String args[]){
String studentNames[]={"Pratiksha","Shashi","Praveen","Swetha","Mahalaxmi","Priyanka","Shrusti","Prerana"};
int roll_No[]={51,424,418,92,410,55,427,53};
char div[]={'A','B','B','B','A','A','B','A'};
float cgpa[]={7.52f,7.00f,7.00f,7.3f,6.8f,7.3f,7.1f,8.3f};
double percentage[]={71.44,68.66,68.5,69.00,59.8,70.00,69.00,79.66};
boolean allClear[]={true,true,true,true,false,true,true,true};
long yearofAdmission[]={2020,2021,2021,2020,2021,2020,2021,2020};
boolean islateral[]={false,true,true,false,true,false,true,false};
byte projectBatchNo[]={4,1,1,8,30,30,4,6};
int arrayLen=studentNames.length;
for (int i=0;i<arrayLen;i++){
	System.out.println("Student Info "+i);
	System.out.println("\n_______________________________________");
	System.out.println("Student Name: "+studentNames[i]);
	System.out.println("Student Roll No: "+roll_No[i]);
	System.out.println("Student Div: "+div[i]);
	System.out.println("Course CGPA: "+cgpa[i]);
	System.out.println("Student Percentage: "+percentage[i]);
	System.out.println("Student cleared all Exams: "+allClear[i]);
	System.out.println("Year of Admission: "+yearofAdmission[i]);
	System.out.println("Student is Lateral Entry: "+islateral[i]);
	System.out.println("Final Project Batch No.: "+projectBatchNo[i]);
	System.out.println("\n_______________________________________\n");
}
}
}