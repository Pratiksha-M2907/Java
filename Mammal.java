public class Mammal {
    String m_name;
    int life_span;
    String family;
    String species;
    String habitat;

    Mammal(String m_name, int life_span, String family, String species, String habitat) {
        this.m_name = m_name;
        this.life_span = life_span;
        this.family = family;
        this.species = species;
        this.habitat = habitat;
        System.out.println("Mammle: " + m_name + "\nLife Span: " + life_span + "\nFamily: " + family + "\nSpecies: " + species + "\nHabitat: " + habitat + "\n");
    }

    public static void main(String[] args) {
        Mammal m1 = new Mammal("Lion", 15, "Felidae", "Panthera leo", "Savannah");
        Mammal m2 = new Mammal("Elephant", 70, "Elephantidae", "Loxodonta africana", "Forest");
        Mammal m3 = new Mammal("Giraffe", 25, "Giraffdae", "Giraffa camelopardalis", "Savannah");
        Mammal m4 = new Mammal("Kangaroo", 20, "Macropodidae", "Macropus giganteus", "Grassland");
        Mammal m5 = new Mammal("Panda",20, "Ursidae", "Ailuropoda melanoleuca", "Mountain");
    }
}

