public class Runner{
public static void main(String args[]){
Coffee.type();
Coffee.quantity(3);
Coffee.varities(" ","macadamia nut", "pumpkin spice", "english toffee", "butter rum","irish cream");
System.out.println(Coffee.cost(25));

Breakfast.time();
Breakfast.quantity(" 2 plates");
Breakfast.varities(" ","Idli","Dosa","Puri","Upit");
Breakfast.cost ("Idli",60);
}

}