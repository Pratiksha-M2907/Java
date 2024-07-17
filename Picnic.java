class Picnic {
    String[] food;
    int duration;
    float cost;
    String location;
    short attendees;
    boolean hasGames;

    public Picnic(String[] food, int duration, float cost, String location, short attendees, boolean hasGames) {
        this.food = food;
        this.duration = duration;
        this.cost = cost;
        this.location = location;
        this.attendees = attendees;
        this.hasGames = hasGames;
    }

    public void display() {
        System.out.println("Picnic: " + location);
        System.out.println("Food: " + food[0]+" and "+food[1]);
        System.out.println("Duration: " + duration);
        System.out.println("Cost: " + cost);
        System.out.println("Attendees: " + attendees);
        System.out.println("Has Games: " + hasGames);
        System.out.println();
    }
}
