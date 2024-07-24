public class CountryInfo {
    public static String continent = "Asia";
    public static int numberOfCountries = 195;
    public static double totalArea = 44587927.45;
    public static String largestCountry = "Russia";
    public static String smallestCountry = "Vatican City";
	
    public String countryName;
    public String capital;
    public long population;
    public double area;
    public String language;

    public CountryInfo(String countryName, String capital, long population, double area, String language) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.language = language;
    }

}


