public class Cricket {
    public static void calculateRunRate(String playerName, int totalScore, int totalOvers) {
        float runRate = (totalScore / totalOvers) * 6; 
        System.out.println("Player Name: " + playerName+"\nTotal Score: " + totalScore+"\nTotal Overs: " + totalOvers+"\nRun Rate: "+runRate+"\n");
    }
	    public static void displayMatchResult(String t1, String t2, int score_t1, int score_t2) {
        String result;
        if (score_t1 > score_t2) {
		    int res=score_t1-score_t2;
            System.out.println(t1 + "'s Score is: " + score_t1+"and "+t2+"'s score is:"+score_t2+"\n won by "+res+" runs");
        } else if (score_t2 > score_t1) {
            int res=score_t2-score_t1;
            System.out.println(t2 + "'s Score is: " + score_t2+" won by"+res+" runs");
        } else {
            System.out.println(t1 + "'s Score is: " + score_t1+"and "+t2+"'s Score is: "+score_t2+" \nOppss! its a tie..");
        }
       
    }

    public static void displayTeamPlayers() {
		String players[]={" ","Virat Kohli","Bumrah","Jadeja","Rohit Sharma","Arshdeep","Mohmmad Siraj","Hardik Pandya","Suryakumar Yadaw","Shivam Dube","Rishab Pant","Kuldeep Yadaw"};
        System.out.println("Captain"+players[3]+"\n");
		System.out.println("Team Players:");
        for (int i = 1; i < players.length; i++) {
			System.out.println(i+" "+players[i]+"\n");
			
        }
    }
	    public static void displayPlayerDetails(String name, int age, double height, double weight, String education, int matches, int totalScore) {
		
        System.out.println("\n_________Player Details:__________");
        System.out.println("Name: " + name+"\nAge: " + age+"\nHeight: " + height + " feet"+"\nWeight: " + weight + " kg"+"\nEducation: " + education+"\nNumber of Matches: " + matches+"\nTotal Score: " + totalScore);
        
    }
}




