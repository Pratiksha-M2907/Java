public class EmployeeDetails {

    public static String companyName = "Xworkz";
    public static String companyAddress = "BTM, 2nd stage";
    public static String employeeId;
    public static String name;
    public static String department;
    public static String position;
    public static double salary;
    public static String email;
    public static String phoneNumber;
    public static String hireDate;
    public static String supervisor;
    public static boolean isFullTime;

    public static void Employee(String employeeId, String name, double salary) {
        EmployeeDetails.employeeId = employeeId;
        EmployeeDetails.name = name;
        EmployeeDetails.salary = salary;
        EmployeeDetails.department = "Trainee";
        EmployeeDetails.position = "Software Engineer Trainee";
        EmployeeDetails.email = "Pratiksha.xworkzodc@gmail.com";
        EmployeeDetails.phoneNumber = "987-654-3210";
        EmployeeDetails.hireDate = "2020-06-10";
        EmployeeDetails.supervisor = "Vinoda";
        EmployeeDetails.isFullTime = true;
    }

    public static void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: Rs" + salary);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Supervisor: " + supervisor);
        System.out.println("Full Time: " + isFullTime);
    }
}