public class PicnicRunner{
public static void main(String[] args){
		Picnic picnic1 = new Picnic(new String[]{"sandwich", "fruit"}, 2, 50f, "Park 1", (short) 10, true);
        Picnic picnic2 = new Picnic(new String[]{"chips", "cookies"}, 3, 60f, "Park 2", (short) 12, false);
        Picnic picnic3 = new Picnic(new String[]{"cake", "ice cream"}, 4, 70f, "Park 3", (short) 15, true);
        Picnic picnic4 = new Picnic(new String[]{"burger", "pizza"}, 5, 80f, "Park 4", (short) 18, false);

        picnic1.display();
        picnic2.display();
        picnic3.display();
        picnic4.display();
		}
		}