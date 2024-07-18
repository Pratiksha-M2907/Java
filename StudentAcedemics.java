public class StudentAcedemics{

int id;
String name;
int age;
char gender;
char grade; 
String section;
String[] subjects;
int[] marks;
String address;
long phone;

StudentAcedemics(int id){
	this.id=id;
	System.out.println("Student id: " +id);
	System.out.println("\n");
}
StudentAcedemics(int id, String name){
	this.id=id;
	this.name=name;
	System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
	System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
	System.out.println("Grade: " +grade);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade,String section){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	this.section=section;
	System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
    System.out.println("Grade: " +grade);
    System.out.println("Section: " +section);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade,String section,String[] subjects){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	this.section=section;
	this.subjects=subjects;
    System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
    System.out.println("Grade: " +grade);
    System.out.println("Section: " +section);
    System.out.println("Subjects: " +subjects[0]+" , "+subjects[1]+" , "+subjects[2]+" and "+subjects[3]);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade,String section,String[] subjects,int[] marks){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	this.section=section;
	this.subjects=subjects;
	this.marks=marks;
    System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
    System.out.println("Grade: " +grade);
    System.out.println("Section: " +section);
    System.out.println("Subjects: " +subjects[0]+" , "+subjects[1]+" , "+subjects[2]+" and "+subjects[3]);
	System.out.println("Marks: " +marks[0]+" , "+marks[1]+" , "+marks[2]+" and "+marks[3]);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade,String section,String[] subjects,int[] marks,String address){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	this.section=section;
	this.subjects=subjects;
	this.marks=marks;
	this.address=address;
    System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
    System.out.println("Grade: " +grade);
    System.out.println("Section: " +section);
    System.out.println("Subjects: " +subjects[0]+" , "+subjects[1]+" , "+subjects[2]+" and "+subjects[3]);
    System.out.println("Marks: " +marks[0]+" , "+marks[1]+" , "+marks[2]+" and "+marks[3]);
	System.out.println("Address: " +address);
	System.out.println("\n");
}
StudentAcedemics(int id, String name,int age,char gender,char grade,String section,String[] subjects,int[] marks,String address,long phone){
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.grade=grade;
	this.section=section;
	this.subjects=subjects;
	this.marks=marks;
	this.address=address;
	this.phone=phone;
    System.out.println("Student id: " +id);
	System.out.println("Nmae: "+name);
	System.out.println("Age: " +age);
	System.out.println("Gender: " +gender);
    System.out.println("Grade: " +grade);
    System.out.println("Section: " +section);
    System.out.println("Subjects: " +subjects[0]+" , "+subjects[1]+" , "+subjects[2]+" and "+subjects[3]);
    System.out.println("Marks: " +marks[0]+" , "+marks[1]+" , "+marks[2]+" and "+marks[3]);
    System.out.println("Address: " +address);
    System.out.println("Phone: " +phone);
	System.out.println("\n");
}
}