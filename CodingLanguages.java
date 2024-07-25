public class CodingLanguages {
    public int index = 0;
    public String codingLanguages[] = new String[5];

    public int getCodingLanguagesInfoLength() {
        return codingLanguages.length;
    }

    public void displayCodingLanguages() {
        System.out.println("\nRead Operation: ");
        System.out.println("Array elements are:\n");
        for (int index = 0; index < this.getCodingLanguagesInfoLength(); index++) {
            System.out.println("codingLanguages[" + index + "]=" + codingLanguages[index]);
        }
    }

    public void AddCodingLanguage(String ele) {
        System.out.println("\nInsert Operation:");
        if (this.index < this.getCodingLanguagesInfoLength()) {
            System.out.println("Array has Space for insertion");
            System.out.println("Insert element: " + ele);
            this.codingLanguages[index] = ele;
            this.index++;
        } else {
            System.out.println("Array has no enough Space for insertion\n cannot insert element " + ele);
        }
        this.displayCodingLanguages();
    }

    public void DeleteCodingLanguage(String ele) {
        System.out.println("\nDelete Operation:");
        for (int index = 0; index < this.getCodingLanguagesInfoLength(); index++) {
            if (this.codingLanguages[index] == ele) {
                System.out.println("Element Deleted");
                this.codingLanguages[index] = null;
            } else
                System.out.println("Element cannot be Deleted");
        }
        this.displayCodingLanguages();
    }

    public void UpdateCodingLanguage(String ele, String oldele) {
        System.out.println("\nUpdate Operation:");
        for (int index = 0; index < this.getCodingLanguagesInfoLength(); index++) {
            if (this.codingLanguages[index] == oldele) {
                this.codingLanguages[index] = ele;
                System.out.println("Element Updated from " + oldele + " to " + ele);
            } else
                System.out.println("Element cannot be updated");
        }
        this.displayCodingLanguages();
    }

    public void SearchCodingLanguage(String ele) {
        System.out.println("\nSearch Operation:");
        for (int index = 0; index < this.getCodingLanguagesInfoLength(); index++) {
            if (this.codingLanguages[index] == ele) {
                System.out.println("Element found " + ele);
            } else
                System.out.println("Element Not found");
        }
        this.displayCodingLanguages();
    }
}

