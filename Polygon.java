public class Polygon {
    public int sides;
    public int length;
	public String name;
	
	public Polygon(){
		System.out.println("Polygon");
	}
	
    public void set(int sides,String name) 
	{
    System.out.println("Polygon is "+sides+" sided");
	System.out.println("Polygon is "+name);
    }

    public void set(int length) {
        System.out.println("Side length is "+length+" cm");
    }

    public int set(int sides,int length) {
        return sides * length;
    }
}
