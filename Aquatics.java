public class Aquatics {
    String name;
    int lifeSpan;
    String species;
    String habitat;
    String typeOfConsumer;
    String family;

    Aquatics(String name) {
        this.name = name;
        System.out.println("Aquatic is: " + name);
        System.out.println("\n");
    }

    Aquatics(String name, int lifeSpan) {
        this.name = name;
        this.lifeSpan = lifeSpan;
        System.out.println("Aquatic is: " + name);
        System.out.println("Aquatic's lifespan is: " + lifeSpan + " years");
        System.out.println("\n");
    }

    Aquatics(String name, int lifeSpan, String species) {
        this.name = name;
        this.lifeSpan = lifeSpan;
        this.species = species;
        System.out.println("Aquatic is: " + name);
        System.out.println("Aquatic's lifespan is: " + lifeSpan + " years");
        System.out.println("Aquatic belongs to " + species + " species");
        System.out.println("\n");
    }

    Aquatics(String name, int lifeSpan, String species, String habitat) {
        this.name = name;
        this.lifeSpan = lifeSpan;
        this.species = species;
        this.habitat = habitat;
        System.out.println("Aquatic is: " + name);
        System.out.println("Aquatic's lifespan is: " + lifeSpan + " years");
        System.out.println("Aquatic belongs to " + species + " species");
        System.out.println("Aquatic's habitat is: " + habitat);
        System.out.println("\n");
    }

    Aquatics(String name, int lifeSpan, String species, String habitat, String typeOfConsumer) {
        this.name = name;
        this.lifeSpan = lifeSpan;
        this.species = species;
        this.habitat = habitat;
        this.typeOfConsumer = typeOfConsumer;
        System.out.println("Aquatic is: " + name);
        System.out.println("Aquatic's lifespan is: " + lifeSpan + " years");
        System.out.println("Aquatic belongs to " + species + " species");
        System.out.println("Aquatic's habitat is: " + habitat);
        System.out.println("Aquatic is a " + typeOfConsumer);
        System.out.println("\n");
    }

    Aquatics(String name, int lifeSpan, String species, String habitat, String typeOfConsumer, String family) {
        this.name = name;
        this.lifeSpan = lifeSpan;
        this.species = species;
        this.habitat = habitat;
        this.typeOfConsumer = typeOfConsumer;
        this.family = family;
        System.out.println("Aquatic is: " + name);
        System.out.println("Aquatic's lifespan is: " + lifeSpan + " years");
        System.out.println("Aquatic belongs to " + species + " species");
        System.out.println("Aquatic's habitat is: " + habitat);
        System.out.println("Aquatic is a " + typeOfConsumer);
        System.out.println("Aquatic belongs to " + family + " family");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Aquatics a0 = new Aquatics("Shark");
        Aquatics a1 = new Aquatics("Tuna", 10);
        Aquatics a2 = new Aquatics("Goldfish", 5, "Carassius auratus");
        Aquatics a3 = new Aquatics("Octopus", 3, "Octopus vulgaris", "Ocean");
        Aquatics a4 = new Aquatics("Swordfish", 6, "Xiphias gladius", "Ocean", "Carnivore");
		Aquatics a5 = new Aquatics("Jellyfish", 7, "Aurelia aurita", "Ocean", "Carnivore", "Pelagiidae");
    }
}


