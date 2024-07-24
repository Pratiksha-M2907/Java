public class CosmeticRunner{
	public static void main(String[] args){
		
		Cosmetic c1=new Cosmetic("Lakme","Skincare",1585,2,true);
		c1.checkAffordability(1585);
		c1.checkAvailability(true,2);
		c1.checkSkincare("Skincare");
		c1.checkDiscount(1585,2);
		c1.checkPremium("Lakme");
		
		
	}

}