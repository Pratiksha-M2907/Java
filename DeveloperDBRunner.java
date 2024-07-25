public class DeveloperDBRunner {
    public static void main(String[] args) {
        DeveloperDB d = new DeveloperDB();
        d.getDeveloperDBLength();
        d.DeveloperInsertion("Pratiksha M");
        d.DeveloperInsertion("Shashi G");
        d.DeveloperInsertion("Praveen T");
        d.DeleteDeveloper("Praveen T");
        d.UpdateDeveloper("Shashi S G", "Shashi G");
        d.SearchDeveloper("Pratiksha M");
    }
}
