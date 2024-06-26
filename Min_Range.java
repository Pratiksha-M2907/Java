public class Min_Range{
static byte bMin=-128;
static short sMin=-32768;
static int iMin=-2147483648;
static long lMin=-9223372036854775808L;
static float fMin=1.40239846e-45f;
static double dMin=4.94065645841246544e-324;
static char cMin=('\u0000');
static boolean blnMin=false;
public static void main(String[] args) {
        System.out.println("Minimum value of byte: " + bMin);
        System.out.println("Minimum value of short: " + sMin);
        System.out.println("Minimum value of int: " + iMin);
        System.out.println("Minimum value of long: " + lMin);
        System.out.println("Minimum value of float: " + fMin);
        System.out.println("Minimum value of double: " + dMin);
        System.out.println("Minimum value of char: " +(int) cMin);
		System.out.println("Minimum value of Boolean: " + blnMin);
    }
}