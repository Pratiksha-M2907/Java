
public class SpicesRunner {
    public static void main(String[] args) {
        Spices.Flavor();
        Spices.SpiceNames("Cumin","Turmeric","Pepper");
        System.out.println(Spices.GetSpiceCount());
        Spices.GetSpiceDetails(1);
    }
}



