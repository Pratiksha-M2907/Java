public class ParksRunner {
    public static void main(String[] args) {
        Parks.Relax();
        Parks.ParkNames("Cubben Park","Lalbagh","Nandhanavana");
        System.out.println(Parks.GetParkCount());
        Parks.GetParkDetails(1);
    }
}


