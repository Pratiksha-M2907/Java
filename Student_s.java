public class Student_s{
    String usn;
    String name;
    int age;
    String gender;
    String department;

    Student_s(String usn, String name, int age, String gender, String department) {
        this.usn= usn;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
		System.out.println("USN: "+usn+"\n Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nDepartment: "+department+"\n");
    }
public static void main(String[] args) {
        Student_s s1 = new Student_s("2BU21CS424", "Shashi", 22, "Male", "Computer Science");
        Student_s s2 = new Student_s("2BU20CS051", "Pratiksha", 22, "Female", "Computer Science");
        Student_s s3 = new Student_s("2BU21CS418", "Praveen", 22, "Male", "Computer Science");
        Student_s s4 = new Student_s("2BU20CS087", "Shweta", 20, "Female", "Computer Science");
        Student_s s5 = new Student_s("2BU20EC067", "Veena", 22, "Female", "Electronics and Telecommunication");
    }
}

