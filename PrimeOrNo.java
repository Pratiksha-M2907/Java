public class PrimeOrNo {
   public static void main(String[] args) {
      int num = 34;
      int count = 0;
      if(num<=1) {
         System.out.println(num + " is neither prime nor composite number");
      }
	  else{
		    for(int i = 1; i<num; i++) {
               if(num % i == 0) {
                  count++;
            }
        }
	   }
      if(count>=2) {
            System.out.println(num + " is not a prime number");
         }		 
	  else {
            System.out.println(num + " is a prime number");
           }
      }
   }