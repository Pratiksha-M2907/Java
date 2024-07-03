public class T20Cup {
  static String team2Name = "India";
  static int runsScored = 120;
  static boolean isBatting = true;
  static boolean isBowling = false;
  static boolean isWinning = true;
  static boolean isRaining = false;
  static int wicketsLost = 2;

  public static void identifyTeam() {
	 System.out.println("Team:\n");
	 System.out.println("Opponent is: SouthAftrica");
    if (team2Name=="India") {
      System.out.println("Team Playing is: "+team2Name+" ,its SouthAftrica v/s "+team2Name+"\n");
    } else if (team2Name=="Australia") {
      System.out.println("Team Playing is: "+team2Name+" ,its SouthAftrica v/s "+team2Name);
    } else if (team2Name=="England") {
      System.out.println("Team Playing is: "+team2Name+" ,its SouthAftrica v/s "+team2Name);
    } else if (team2Name=="Pakistan") {
      System.out.println("Team Playing is: "+team2Name+" ,its SouthAftrica v/s "+team2Name);
    } else {
      System.out.println("Team Playing is Not Known ");
    }
  }

  public static void checkScoreandWickets() {
	  System.out.println("Score and Wickets Lost:\n");
	System.out.println("Team after completing 10 overs");
    if (runsScored >= 100) {
      System.out.println("Team Playing great! runs:"+runsScored);
    } 
	else if (runsScored <= 50) {
	  System.out.println("Team need to bat well");
    } 
	else {
	  System.out.println("Match is at tough competing");
    }
	if (wicketsLost >= 5) {
      System.out.println("Alert1 Wickets are running");
    } else if (wicketsLost <= 2) {
      System.out.println("Great Batting Consistency\n");
    }
  }

  public static void describeMatch() {
    if (isBatting == true) {
	  System.out.println("Match Description:\n");
      System.out.println("Team is batting");
    } else if (isBowling == true) {
      System.out.println("Team is bowling");
    } else if (isRaining==true){
      System.out.println("Match is paused due to rain");
    }
    if (isWinning == true) {
      System.out.println("Team "+team2Name+ "wins it all easily");
    } else {
      System.out.println("South Aftrica Wins\n");
    }
  }
 public static void main(String[] args){
	  System.out.println("\n__T20 CUP__\n");
	  identifyTeam();
	  checkScoreandWickets();
	  describeMatch();
	  
  }
}
