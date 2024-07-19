public class Reptile {
    String r_name;
    int life_span;
    String family;
    String species;
    String consumer_type;

    Reptile(String r_name, int life_span, String family, String species, String consumer_type) {
        this.r_name = r_name;
        this.life_span = life_span;
        this.family = family;
        this.species = species;
        this.consumer_type = consumer_type;
        System.out.println("Reptile: " + r_name + "\nLife Span: " + life_span + "\nFamily: " + family + "\nSpecies: " + species + "\nConsumer Type: " + consumer_type + "\n");
    }

    public static void main(String[] args) {
        Reptile r1 = new Reptile("Snake", 20, "Serpentes", "Serpentes", "Carnivore");
        Reptile r2 = new Reptile("Lizard", 10, "Lacertilia", "Lacertilia", "Herbivore");
        Reptile r3 = new Reptile("Crocodile", 70, "Crocodylidae", "Crocodylus niloticus", "Carnivore");
        Reptile r4 = new Reptile("Turtle", 80, "Testudines", "Testudines", "Herbivore");
        Reptile r5 = new Reptile("Alligator", 50, "Alligatoridae", "Alligator mississippiensis", "Carnivore");
    }
}
