public class Insects {
    String name;
    int lifespan;
    String species;
    String habitat;
    String typeOfFood;
    String family;

    Insects(String name) {
        this.name = name;
        System.out.println("Insect is: " + name);
        System.out.println("\n");
    }

    Insects(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;
        System.out.println("Insect is: " + name);
        System.out.println("Insect's lifespan is: " + lifespan + " years");
        System.out.println("\n");
    }

    Insects(String name, int lifespan, String species) {
        this.name = name;
        this.lifespan = lifespan;
        this.species = species;
        System.out.println("Insect is: " + name);
        System.out.println("Insect's lifespan is: " + lifespan + " years");
        System.out.println("Insect belongs to " + species + " species");
        System.out.println("\n");
    }

    Insects(String name, int lifespan, String species, String habitat) {
        this.name = name;
        this.lifespan = lifespan;
		this.species = species;
        this.habitat = habitat;
        System.out.println("Insect is: " + name);
        System.out.println("Insect's lifespan is: " + lifespan + " years");
        System.out.println("Insect belongs to " + species + " species");
        System.out.println("Insect's habitat is: " + habitat);
        System.out.println("\n");
    }

    Insects(String name, int lifespan, String species, String habitat, String typeOfFood) {
        this.name = name;
        this.lifespan = lifespan;
        this.species = species;
        this.habitat = habitat;
        this.typeOfFood = typeOfFood;
        System.out.println("Insect is: " + name);
        System.out.println("Insect's lifespan is: " + lifespan + " years");
        System.out.println("Insect belongs to " + species + " species");
        System.out.println("Insect's habitat is: " + habitat);
        System.out.println("Insect's type of food is: " + typeOfFood);
        System.out.println("\n");
    }

    Insects(String name, int lifespan, String species, String habitat, String typeOfFood, String family) {
        this.name = name;
        this.lifespan = lifespan;
        this.species = species;
        this.habitat = habitat;
        this.typeOfFood = typeOfFood;
        this.family = family;
        System.out.println("Insect is: " + name);
        System.out.println("Insect's lifespan is: " + lifespan + " years");
        System.out.println("Insect belongs to " + species + " species");
		System.out.println("Insect's habitat is: " + habitat);
        System.out.println("Insect's type of food is: " + typeOfFood);
        System.out.println("Insect belongs to " + family + " family");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Insects i0 = new Insects("Butterfly");
        Insects i1 = new Insects("Bee", 2);
        Insects i2 = new Insects("Ant", 3, "Solenopsis invicta");
        Insects i3 = new Insects("Grasshopper", 4, "Chorthippus parallelus", "Grassland");
        Insects i4 = new Insects("Ladybug", 5, "Coccinella septempunctata", "Garden", "Herbivore");
        Insects i5 = new Insects("Firefly", 6, "Photinus pyralis", "Forest", "Omnivore", "Lampyridae");
    }
}
