public class OpenAi{
public static void aiSource()
{
 String ai_name="Meta AI";
if(ai_name=="Meta AI")
   System.out.println("AI Source used is"+ai_name);
else
	System.out.println("Some other source");
}
public static void noOfSearches()
{
 int no_OfSearches=20;
if(no_OfSearches>=20)
	System.out.println("Too many searches:"+no_OfSearches+" Searches" );
else
	System.out.println("No of Searches are: "+no_OfSearches);
}
public static void aiSource(String ai_name)
{
if(ai_name=="Meta AI")
   System.out.println("AI Source used is"+ai_name);
else
	System.out.println("Some other source");
}
public static void noOfSearches(int no_OfSearches)
{
if(no_OfSearches>=20)
	System.out.println("Too many searches:"+no_OfSearches+" Searches" );
else
	System.out.println("No of Searches are: "+no_OfSearches);
}
public static void aisource()
{
 String ai_name="Meta AI";
if(ai_name=="Meta AI"){
   System.out.println("AI Source used is"+ai_name);
   return;
}
else
	System.out.println("Some other source");
}
public static void noSearches()
{
 int no_OfSearches=20;
if(no_OfSearches>=20)
{
	System.out.println("Too many searches");
    return;
}
else
	System.out.println("No of Searches are: "+no_OfSearches);
}
public static String aisource(String ai_name)
{
if(ai_name=="Meta AI")
	System.out.println("AI Source used is"+ai_name);
else
	System.out.print("Source is : ");
    return "Chat gpt";
}
public static int noSearches(int no_OfSearches)
{
if(no_OfSearches>=20)
	System.out.println("Too many searches:"+no_OfSearches+" Searches" );
else
	System.out.println("Your are within limit");
    return 20;
}
}