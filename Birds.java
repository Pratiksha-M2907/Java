public class Birds {
    String name;
    int age;
    String species;
    String habitat;
    String diet;
    int wingspan;
	
	Birds(String name) {
        this.name = name;
		System.out.println("Bird is: "+name);
		System.out.println("\n");
    }

    Birds(String name, int age) {
        this.name = name;
        this.age = age;
		System.out.println("Bird is: "+name);
		System.out.println("Bird is: "+age+" years old ");
		System.out.println("\n");
    }

    Birds(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
		System.out.println("Bird is: "+name);
		System.out.println("Bird is: "+age+" years old ");
		System.out.println("Bird belongs to "+species+" species");
		System.out.println("\n");
    }

    Birds(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
		System.out.println("Bird is: "+name);
		System.out.println("Bird is: "+age+" years old ");
		System.out.println("Bird belongs to "+species+" species");
		System.out.println("Bird's habitat is: "+habitat);
		System.out.println("\n");
    }

    Birds(String name, int age, String species, String habitat, String diet) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
		System.out.println("Bird is: "+name);
		System.out.println("Bird is: "+age+" years old ");
		System.out.println("Bird belongs to "+species+" species");
		System.out.println("Bird's habitat is: "+habitat);
		System.out.println("Bird is a "+diet);
		System.out.println("\n");
    }

    Birds(String name, int age, String species, String habitat, String diet, int wingspan) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
        this.wingspan = wingspan;
		System.out.println("Bird is: "+name);
		System.out.println("Bird is: "+age+" years old ");
		System.out.println("Bird belongs to "+species+" species");
		System.out.println("Bird's habitat is: "+habitat);
		System.out.println("Bird is a "+diet);
		System.out.println("Bird's wingspan is: "+wingspan);
		System.out.println("\n");
    }

    public static void main(String[] args) {
	    Birds b0=new Birds("Macao");
        Birds b1 = new Birds("Eagle", 5);
        Birds b2 = new Birds("Parrot", 3, "Psittacus erithacus");
        Birds b3 = new Birds("Sparrow", 2, "Passer domesticus", "Urban");
        Birds b4 = new Birds("Falcon", 4, "Falco peregrinus", "Mountain", "Carnivore");
        Birds b5 = new Birds("Penguin", 7, "Aptenodytes patagonicus", "Antarctica", "Fish", 180);
    }
}
