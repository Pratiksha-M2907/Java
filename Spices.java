
class Spices {
    public static void Flavor() {
        if (true) {
            System.out.println("Spices Flavoring");
        } else {
            System.out.println("Spices Not Flavoring");
        }
    }
public static void SpiceNames(String ... name){   
    System.out.println("Menue:\n");
	for(int p=1;p<name.length;p++){
    System.out.println(" "+p+". "+name[p]);
	}
	System.out.println("Spice: "+name[2]);
}

    public static int GetSpiceCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetSpiceDetails(int spiceId) {
        if (spiceId > 0) {
            return "Spice Name: Cumin, Flavor: Earthy";
        } else {
            return "Spice Id is invalid";
        }
    }
}
