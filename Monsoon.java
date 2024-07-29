public class Monsoon {
    public String season;
    public int rainfall;
    public boolean flooding=false;
	
	public void MonsoonInfo(){
        System.out.println("Monsoon Info!");
    }
    public String MonsoonInfo(int rainfall) {
       if (rainfall>20){
		   System.out.println("Monsoon is: "+rainfall+" cm Red alert!..");
		   MonsoonInfo();
		   return "Red alert";
	   }
	   else
		   return "Rainfall is not at alarming rate";
    }
    public void MonsoonInfo(String season,int rainfall) {
        System.out.println("Season: " + season);
        System.out.println("Rainfall: " + rainfall+" cm");
        System.out.println("Flooding: " + flooding);
		MonsoonInfo(25);
    }
	public String IsFloodAlert() {
        if(flooding==false){
			MonsoonInfo("Rainy Season",25);
			return "Low chances of Flood";
        }
		else
			return "High chances of Flood";
    }
}
