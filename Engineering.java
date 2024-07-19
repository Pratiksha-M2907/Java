public class Engineering {
    String name;
    String college;
    String branch;
    String university;
    int yearOfJoin;
    String typeOfAdmission;
    int yearOfPassout;

    Engineering(String college) {
        this.college = college;
        System.out.println("My College is : " + college);
        System.out.println("\n");
    }

    Engineering(String college, String branch) {
        this(college);
        this.branch = branch;
        System.out.println("Branch: " + branch);
        System.out.println("\n");
    }

    Engineering(String college, String branch, String university) {
        this(college, branch);
        this.university = university;
        System.out.println("University: " + university);
        System.out.println("\n");
    }

    Engineering(String college, String branch, String university, int yearOfJoin) {
        this(college, branch, university);
        this.yearOfJoin = yearOfJoin;
        System.out.println("Year of Join: " + yearOfJoin);
        System.out.println("\n");
    }

    Engineering(String college, String branch, String university, int yearOfJoin, String typeOfAdmission) {
        this(college, branch, university, yearOfJoin);
        this.typeOfAdmission = typeOfAdmission;
        System.out.println("Type of Admission: " + typeOfAdmission);
        System.out.println("\n");
    }

    Engineering(String college, String branch, String university, int yearOfJoin, String typeOfAdmission, int yearOfPassout) {
        this(college, branch, university, yearOfJoin, typeOfAdmission);
        this.yearOfPassout = yearOfPassout;
        System.out.println("Year of Passout: " + yearOfPassout);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Engineering e = new Engineering("S.G.B.I.T", "Computer Science and Engineering", "VTU", 2020, "KCET", 2024);
    }
}
