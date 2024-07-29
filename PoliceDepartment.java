public class PoliceDepartment {
    public String departmentName;
    public String location;
    public String phoneNumber;
    public String superintendentName;

    public PoliceDepartment(String departmentName, String location, String phoneNumber, String superintendentName) {
        this.departmentName = departmentName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.superintendentName = superintendentName;
    }

    public void display() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Location: " + location);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Superintendent Name: " + superintendentName);
    }
}

