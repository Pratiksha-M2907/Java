class Parks {
    

    public static void ParkNames(String ... name){   
    System.out.println("Menue:\n");
	for(int p=1;p<name.length;p++){
    System.out.println(" "+p+". "+name[p]);
	}
	System.out.println("Park is: "+name[2]);
}


    public static int GetParkCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetParkDetails(int parkId) {
        if (parkId > 0) {
            return "Park Name: Nandhanavana, Location: BTM,Bangalore";
        } else {
            return "Park Id is invalid";
        }
    }
	public static void Relax() {
        if (true) {
            System.out.println("Parks Relaxing");
        } else {
            System.out.println("Parks Not Relaxing");
        }
    }
}
