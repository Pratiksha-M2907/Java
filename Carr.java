public class Carr {
   public static float fuelLevel=15.2f;
   public static void getSpeed(float distance,float time) {
    float speed=distance/time;
	System.out.println("Distance Travelled is "+distance+" km");
	System.out.println("Time Taken is "+time+" h");
	System.out.println("Speed is "+speed+" km/h");
  }

  public static void getFuelLevel(float fill_up) {
    System.out.println("Initial fule level is "+fuelLevel+" liters");
	System.out.println("Driver filled up fuel of "+fill_up+" liters");
	float current_fuellevel=fuelLevel+fill_up;
	System.out.println("Currently Fuel Level is "+current_fuellevel+" Liters");
  }

  public static void accelerate(int ini_speed, int catch_up_speed,int time) {
  System.out.println("Initially the speed was "+ini_speed+" km/h");
  System.out.println("Car cought up the speed "+catch_up_speed+" km/h");
  int accelerate=(catch_up_speed-ini_speed)/time;
  System.out.println("Car accelerated by "+accelerate+"km/h");
  }

  public static void milage(float distance, int fuel_cons) {
    System.out.println("Distance travelled is "+distance+" km");
	System.out.println("Fuel consumed is "+fuel_cons+" liters");
	float milage=distance/fuel_cons;
	System.out.println("Milage is "+milage+"km/l");
  }

  public static void goodMilage(double milage) {
    if(milage>=18 && milage<=22)
	{
		System.out.println("Car gives good milage");
	}
	else
	{
		System.out.println("Car doen't give great milage");
	}
  }

  public static void fuel_consumption_rate (int fuel_cons) {
    System.out.println("Fuel Consumed is "+fuel_cons);
	if(fuel_cons>=28 && fuel_cons<32)
	{
		System.out.println("Car consumes less fuel");
	}
	System.out.println("Car consumes too much fuel");
	
  }
}