class Payroll {
public static String init() {
return "Method with 0 parameters";
}

public static String init(String employeeId) {
return "Method with 1 parameter: " + employeeId;
}

public static String init(String employeeId, double salary) {
return "Method with 2 parameters: " + employeeId + ", " + salary;
}

public static String init(String employeeId, double salary, int deductions) {
return "Method with 3 parameters: " + employeeId + ", " + salary + ", " + deductions;
}

public static String init(String employeeId, double salary, int deductions, String department) {
return "Method with 4 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager) {
return "Method with 5 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager, int experience) {
return "Method with 6 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager + ", " + experience;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager, int experience, String location) {
return "Method with 7 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager + ", " + experience + ", " + location;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager, int experience, String location, boolean isFullTime) {
return "Method with 8 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager + ", " + experience + ", " + location + ", " + isFullTime;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager, int experience, String location, boolean isFullTime, String benefits) {
return "Method with 9 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager + ", " + experience + ", " + location + ", " + isFullTime + ", " + benefits;
}

public static String init(String employeeId, double salary, int deductions, String department, boolean isManager, int experience, String location, boolean isFullTime, String benefits, int leaves) {
return "Method with 10 parameters: " + employeeId + ", " + salary + ", " + deductions + ", " + department + ", " + isManager + ", " + experience + ", " + location + ", " + isFullTime + ", " + benefits + ", " + leaves;
}
}

