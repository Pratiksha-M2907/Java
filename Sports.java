public class Sports {
    String[] equipment;
    int players;
    float duration;
    String location;
    short teams;
    boolean hasReferee;

    public Sports(String[] equipment, int players, float duration, String location, short teams, boolean hasReferee) {
        this.equipment = equipment;
        this.players = players;
        this.duration = duration;
        this.location = location;
        this.teams = teams;
        this.hasReferee = hasReferee;
    }

    public void display() {
        System.out.println("Sports: " + location);
        System.out.println("Equipments: " + equipment[0]+" and "+equipment[1]);
        System.out.println("Players: " + players);
        System.out.println("Duration: " + duration);
        System.out.println("Teams: " + teams);
        System.out.println("Has Referee: " + hasReferee);
        System.out.println();
    }
}