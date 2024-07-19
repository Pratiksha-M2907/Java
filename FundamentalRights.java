public class FundamentalRights {
    String name;
    String description;
    int year;
    String category;
    String article;
    String explanation;

    FundamentalRights(String name) {
        this.name = name;
        System.out.println("Name of Fundamental Right: " + name);
        System.out.println("\n");
    }

    FundamentalRights(String name, String description) {
        this(name);
        this.description = description;
        System.out.println("Description: " + description);
        System.out.println("\n");
    }

    FundamentalRights(String name, String description, int year) {
        this(name, description);
        this.year = year;
        System.out.println("Year: " + year);
        System.out.println("\n");
    }

    FundamentalRights(String name, String description, int year, String category) {
        this(name, description, year);
        this.category = category;
        System.out.println("Category: " + category);
        System.out.println("\n");
    }
FundamentalRights(String name, String description, int year, String category, String article) {
        this(name, description, year, category);
        this.article = article;
        System.out.println("Article: " + article);
        System.out.println("\n");
    }

    FundamentalRights(String name, String description, int year, String category, String article, String explanation) {
        this(name, description, year, category, article);
        this.explanation = explanation;
        System.out.println("Explanation: " + explanation);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        FundamentalRights fr = new FundamentalRights("Right to Life", "Freedom from exploitation", 1950, "Social Justice", "Article 21", "Freedom from exploitation and forced labor");
    }
}
