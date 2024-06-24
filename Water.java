public class Water
{
public static void main(String[] args){
    char type ='F';//F-Fresh water,S-Saline Water,B-Brakish water
    int NTU=45;//Turbidity unit
    float PH=7.2F;
    long TDS=1450;//Total Dissolved solids
    boolean purified=true;
    System.out.println("Class name is Water");
    System.out.println("Water type is" +type);
    System.out.println("Turbidity is" +NTU);
    System.out.println("PH is" +PH);
    System.out.println("Dissolved solid is" +TDS+ "mg/L TDS");
    System.out.println("Purified" +purified);
}
}