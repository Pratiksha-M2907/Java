
public class Collegeinfo {
    public static int getTeacherCount() {
	 int i=100;
        if (i==100) {
            return 100;
        } else if (i==200) {
            return 200;
        }
        return 0;
    }

    public static String getCollegeName() {
	 String  i="SGBIT";
        if (i=="SGBIT") {
            return "SGBIT";
        } else if (i=="JGI") {
            return "JGI";
        }
        return "Unknown";
    }

    public static double getAverageGPA() {
	double GPA=3.5;
        if (GPA==3.5) {
            return 3.5;
        } else if (GPA==3.8) {
            return 3.8;
        }
        return 0.0;
    }

    public static boolean isAccredited() {
	boolean accredited=true;
        if (accredited) {
            return true;
        } else if (accredited==false) {
            return false;
        }
        return true;
    }

    public static char getGrade() {
		char grade= 'A';
        if (grade == 'A') {
            return 'A';
        } else if (grade == 'B') {
            return 'B';
        }
        return 'C';
    }

    public static byte getNumberOfDepartments() {
		byte Dept=5;
        if (Dept==5) {
            return 5;
        } else if (Dept==6) {
            return 6;
        }
        return 0;
    }

    public static short getNumberOfStudents() {
		short std_Count = 2000;
        if (std_Count == 1000) {
            return 1000;
        } else if (std_Count == 2000) {
            return 2000;
        }
        return 0;
    }

    public static long getCollegeFund() {
		long fund=2000000;
        if (fund==1000000) {
            return 1000000;
        } else if (fund==2000000) {
            return 2000000;
        }
        return 0;
    }

    public static float getAverageSalary() {
		float Salary=6.0f;
        if (Salary==5.0f) {
            return 50000.0f;
        } else if (Salary==6.0f) {
            return 60000.0f;
        }
        return 0.0f;
    }
}

