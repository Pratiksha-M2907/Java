public class DeveloperDB {
    public int index = 0;
    public String developerNames[] = new String[5];

    public int getDeveloperDBLength() {
        return developerNames.length;
    }

    public void displayDevelopers() {
        System.out.println("\nRead Operation: ");
        System.out.println("Array elements are:\n");
        for (int index = 0; index < this.getDeveloperDBLength(); index++) {
            System.out.println("developerNames[" + index + "]=" + developerNames[index]);
        }
    }

    public void DeveloperInsertion(String ele) {
        System.out.println("\nInsert Operation:");
        if (this.index < this.getDeveloperDBLength()) {
            System.out.println("Array has Space for insertion");
            System.out.println("Insert element: " + ele);
            this.developerNames[index] = ele;
            this.index++;
        } else {
            System.out.println("Array has no enough Space for insertion\n cannot insert element " + ele);
        }
        this.displayDevelopers();
    }

    public void DeleteDeveloper(String ele) {
        System.out.println("\nDelete Operation:");
        for (int index = 0; index < this.getDeveloperDBLength(); index++) {
            if (this.developerNames[index] == ele) {
				System.out.println("Element Deleted");
                this.developerNames[index] = null;
                
            } else
                System.out.println("Element cannot be Deleted");
        }
        this.displayDevelopers();
    }

    public void UpdateDeveloper(String ele, String oldele) {
        System.out.println("\nUpdate Operation:");
        for (int index = 0; index < this.getDeveloperDBLength(); index++) {
            if (this.developerNames[index] == oldele) {
                this.developerNames[index] = ele;
                System.out.println("Element Updated from "+oldele+" to "+ele);
            } else
                System.out.println("Element cannot be updated");
        }
        this.displayDevelopers();
    }

    public void SearchDeveloper(String ele) {
        System.out.println("\nSearch Operation:");
        for (int index = 0; index < this.getDeveloperDBLength(); index++) {
            if (this.developerNames[index] == ele) {
                System.out.println("Element found " + ele);
            } else
                System.out.println("Element Not found");
        }
        this.displayDevelopers();
    }
}