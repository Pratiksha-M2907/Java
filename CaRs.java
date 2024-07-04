public class CaRs {
  public static float fuelLevel=15.2f; 
  
  public static void colors(String... colors){   
    System.out.println("Colors available are: \n");
	for(int p=1;p<colors.length;p++){
    System.out.println(" "+p+". "+colors[p]);
	}
}
   public static void getSpeed(float distance,float time) {
    float speed=distance/time;
	System.out.println("Distance Travelled is "+distance+" km");
	System.out.println("Time Taken is "+time+" h");
	System.out.println("Speed is "+speed+" km/h");
	if(speed>=90){
		System.out.println("Your speed is "+speed+" It has crossed the limit.Control the speed");
	}
	else{
		System.out.println("Speed is in safe range");
	}
  }
 public static void milage() {
	float distance=200.86f;
	int fuel_cons=18;
    System.out.println("Distance travelled is "+distance+" km");
	System.out.println("Fuel consumed is "+fuel_cons+" liters");
	float milage=distance/fuel_cons;
	System.out.println("Milage is "+milage+"km/l");
	if(milage>=18 && milage<=22)
	{
		System.out.println("Car gives good milage");
	}
	else
	{
		System.out.println("Car doen't give great milage");
	}
  }
   public static int fuel_consumption_rate () {
	int fuel_cons=18;
    System.out.println("Fuel Consumed is "+fuel_cons);
	if(fuel_cons>=28 && fuel_cons<32)
	{
		System.out.println("Car consumes less fuel");
	}
	else
	System.out.println("Car consumes too much fuel");
	return 20;
  }
}
