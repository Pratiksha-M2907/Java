public class OpenAi_Runner{
public static void main(String[] args){
	
	OpenAi.aiSource();
	OpenAi.noOfSearches();
	OpenAi.aiSource("Meta AI");
	OpenAi.noOfSearches(15);
	OpenAi.aisource();
	OpenAi.noSearches();
	System.out.println(OpenAi.aisource("Chat gpt"));
	System.out.println("Out of limit"+OpenAi.noSearches(28));
}
}