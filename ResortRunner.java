public class ResortRunner{
public static void main(String[] args) {
		
		Resort resort1 = new Resort(new String[]{"pool", "gym"}, 100, 2000f, "Regenta", (short) 5, true);
        Resort resort2 = new Resort(new String[]{"beach", "spa"}, 50, 1500f, "Pai", (short) 4, false);
        Resort resort3 = new Resort(new String[]{"restaurant", "bar"}, 80, 1600f, "SNB", (short) 5, true);
        Resort resort4 = new Resort(new String[]{"tennis", "golf"}, 120, 200f, "Red Hills", (short) 5, false);

        resort1.display();
        resort2.display();
        resort3.display();
        resort4.display();
		}
}