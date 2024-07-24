public class CountryInfoRunner{
	public static void main(String[] args) {
        CountryInfo india = new CountryInfo("India", "New Delhi", 1380000000l, 3287590, "Hindi");

        System.out.println("Continent: " + CountryInfo.continent);
        System.out.println("Number of Countries: " + CountryInfo.numberOfCountries);
        System.out.println("Total Area: " + CountryInfo.totalArea);
        System.out.println("Largest Country: " + CountryInfo.largestCountry);
        System.out.println("Smallest Country: " + CountryInfo.smallestCountry);
		
        System.out.println("Country Name: " + india.countryName);
        System.out.println("Capital: " + india.capital);
        System.out.println("Population: " + india.population);
        System.out.println("Area: " + india.area);
        System.out.println("Language: " + india.language);
    }
}