class Mocktails {
    
    public static void Menu(String ... menu){   
    System.out.println("Menue:\n");
	for(int p=1;p<menu.length;p++){
    System.out.println(" "+p+". "+menu[p]);
	}
	System.out.println("Drink Ordered is: "+menu[2]);
}


    public static int GetMocktailCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetMocktailDetails(int mocktailId) {
        if (mocktailId > 0) {
            return "Mocktail Name: Virgin Mojito, Price: 4";
        } else {
            return "Mocktail Id is invalid";
        }
    }
	public static void Enjoy() {
        if (true) {
            System.out.println("Mocktails Enjoying");
        } else {
            System.out.println("Mocktails Not Enjoying");
        }
    }

}
