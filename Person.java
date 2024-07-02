public class Person{
 public static void details(int id){
 System.out.println(" Person in the Institution has an id: "+id+"\n");
 }
 public static void details(int id, String name){
 System.out.println(" Person in the Institution id: "+id+" is "+name+"\n");
 }
 public static void details(int id, String name, long sal){
 System.out.println(" Person in the Institution id: "+id+" is "+name+"\n has Salary of Rs "+sal+"\n");
 }
 public static void details(int id, String name, long sal, char initial){
 System.out.println(" Person in the Institution id: "+id+" is "+name+" "+initial+"\n has Salary of Rs "+sal+"\n");
 }
 public static void details(int id, String name, long sal, char initial, double height){
 System.out.println(" Person in the Institution id: "+id+" is "+name+" "+initial+"\n has Salary of Rs "+sal+"\n has height: "+height+" ft \n");
 }
 public static void details(int id, String name, long sal, char initial, double height, float weight){
 System.out.println(" Person in the Institution id: "+id+" is "+name+" "+initial+"\n has Salary of Rs "+sal+"\n has height: "+height+" ft"+"\n has weight: "+weight+" kg \n");
 }
 public static void details(int id, String name, long sal, char initial, double height, float weight, boolean fresher){
 System.out.println(" Person in the Institution id: "+id+" is "+name+" "+initial+"\n has Salary of Rs "+sal+"\n has height: "+height+" ft"+"\n has weight: "+weight+" kg"+"\n is fresher"+fresher);
 }
}