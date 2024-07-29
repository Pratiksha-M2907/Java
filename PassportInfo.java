public class PassportInfo {
    private String passportNumber;
    private String holderName;
    private String issueDate;
    private String expiryDate;

    public PassportInfo(String passportNumber, String holderName, String issueDate, String expiryDate) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public void display() {
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
    }

}