public class CodingLanguagesRunner {
    public static void main(String[] args) {
        CodingLanguages c = new CodingLanguages();
        c.getCodingLanguagesInfoLength();
        c.AddCodingLanguage("Java");
        c.AddCodingLanguage("Python");
        c.AddCodingLanguage("JavaScript");
        c.DeleteCodingLanguage("JavaScript");
        c.UpdateCodingLanguage("Python 3", "Python");
        c.SearchCodingLanguage("Java");
    }
}
