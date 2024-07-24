public class AnimalClass {
    public String name;
    public int age;
    public String species;

    public AnimalClass(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
		System.out.println("Name: "+name+" Age: "+age+" Species: "+species);
    }
}