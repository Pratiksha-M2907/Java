public class TechFest {
    String name;
    int year;
    String location;
    String theme;
    int duration;
    String organizer;

    TechFest(String name) {
		this.name = name;
		System.out.println("Name of Techfest "+name);
		System.out.println("\n");
    }

    TechFest(String name, int year) {
        this(name);
        this.year = year;
		System.out.println("Year: "+year);
		System.out.println("\n");
    }

    TechFest(String name, int year, String location) {
        this(name, year);
        this.location = location;
		System.out.println("Located at "+location);
		System.out.println("\n");
    }

    TechFest(String name, int year, String location, String theme) {
        this(name, year, location);
        this.theme = theme;
        System.out.println("Theme is: "+theme);
		System.out.println("\n");
    }

    TechFest(String name, int year, String location, String theme, int duration) {
        this(name, year, location, theme);
        this.duration = duration;
		System.out.println("Duration is: "+duration+" days");
		System.out.println("\n");
    }

    TechFest(String name, int year, String location, String theme, int duration, String organizer) {
        this(name, year, location, theme, duration);
        this.organizer = organizer;
		System.out.println("Organized by "+organizer);
		System.out.println("\n");
    }
    public static void main(String[] args) {
		TechFest tf = new TechFest("Technow",2024,"Mumbai","Tricky Coding",2,"IIT");
    }
}
