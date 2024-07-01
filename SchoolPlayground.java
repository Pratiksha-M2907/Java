public class SchoolPlayground{

public static void getPlaygroundName(int id) {
    if (id == 1) {
        System.out.println("Playground Name: Main Playground");
    } else if (id == 2) {
        System.out.println("Playground Name: East Side Playground");
    } else if (id == 3) {
        System.out.println("Playground Name: West Side Playground");
    } else if (id == 4) {
        System.out.println("Playground Name: Central Park Playground");
    } else if (id == 5) {
        System.out.println("Playground Name: School Yard Playground");
    } else {
        System.out.println("Invalid Playground ID");
    }
}
public static void getPlaygroundLocation(int id) {
    if (id == 1) {
        System.out.println("Playground Location: 123 Main St");
    } else if (id == 2) {
        System.out.println("Playground Location: 456 East Ave");
    } else if (id == 3) {
        System.out.println("Playground Location: 789 West Blvd");
    } else if (id == 4) {
        System.out.println("Playground Location: 901 Central Park Dr");
    } else if (id == 5) {
        System.out.println("Playground Location: 345 School St");
    } else {
        System.out.println("Invalid Playground ID");
    }
}
public static void calculateAreaofPlayground(int playgroundId, int Length ,int  Width) {

    double distance = 0.0;

    for (int i = 0; i < 5; i++) {
        if (playgroundId == i + 1) {
            distance = Length * Width;
            break;
        }
    }

    System.out.println("Playground " + playgroundId + ": " + distance + "Area");
}
public static void getPlaygroundEquipment() {
    String[] equipment = {
        "Swings",
        "Slides",
        "Monkey Bars",
        "Climbing Wall",
        "Seesaw",
        "Merry-Go-Round",
        "Playhouse",
        "Sandbox",
        "Tire Swing",
        "Basketball Hoop"
    };

    for (String equip : equipment) {
        System.out.println(equip);
    }
}
public static void checkPlaygroundAvailability(int playgroundId) {
    boolean[] availability = {
        true, 
        false, 
        true, 
		true,
		false,
		false
        
    };

    boolean isAvailable = availability[playgroundId - 1];

    if (isAvailable) {
        System.out.println("Playground " + playgroundId + " is available");
    } else {
        System.out.println("Playground " + playgroundId + " is not available");
    }
}


}
