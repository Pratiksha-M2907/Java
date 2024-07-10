public class PayrollRunner {
public static void main(String[] args) {
System.out.println(Payroll.init());
System.out.println(Payroll.init("Emp001"));
System.out.println(Payroll.init("Emp001", 50000.0));
System.out.println(Payroll.init("Emp001", 50000.0, 10));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales"));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true, 5));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true, 5, "Bangalore"));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true, 5, "Bangalore", true));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true, 5, "Bangalore", true, "HealthInsurance"));
System.out.println(Payroll.init("Emp001", 50000.0, 10, "Sales", true, 5, "Bangalore", true, "HealthInsurance", 20));
}
}