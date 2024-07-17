public class Ap{
public static int a=5;
public static int res;
public static void main (String args[]){
    if(a==4){
        for (int i = 4; i >= 1; i--) {
            System.out.println(i);
			res=res+i;
        }
	System.out.println("Result of Series where a=4 is:"+res);
    }
else if(a==5){
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
			res=res+i;
        }
	System.out.println("Result of Series where a=5 is:"+res);
}
else if(a==6){
for (int i = 6; i >= 1; i--) {
            System.out.println(i);
			res=res+i;
        }
	System.out.println("Result of Series where a=6 is:"+res);
}
else if(a==10){
for (int i = 10; i >= 1; i--) {
            System.out.println(i);
			res=res+i;
        }
	System.out.println("Result of Series where a=10 is:"+res);
}
}

}
