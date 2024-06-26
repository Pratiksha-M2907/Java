public class Max_Range{
static byte bMax=127;
static short sMax=32767;
static int iMax=2147483647;
static long lMax=9223372036854775807L;
static float fMax=3.40282347e+38f;
static double dMax=1.79769313486231570e+308;
static char cMax=('\uffff');
static boolean blnMax=true;
public static void main(String[] args) {
        System.out.println("Maximum value of byte: " + bMax);
        System.out.println("Maximum value of short: " + sMax);
        System.out.println("Maximum value of int: " + iMax);
        System.out.println("Maximum value of long: " + lMax);
        System.out.println("Maximum value of float: " + fMax);
        System.out.println("Maximum value of double: " + dMax);
        System.out.println("Maximum value of char: " +(int) cMax);
		System.out.println("Maximum value of Boolean: " + blnMax);
    }
}