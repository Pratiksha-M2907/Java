class Searchengine {
    public static void main(String[] args) {
        String searchQuery = "best java programming books";
        int searchResultsCount = 2345678;
        long searchTime = 350; 
        String userLocation = "Bengaluru";
        String rankingAlgorithm = "PageRank";
        String searchEngineDomain = "www.mysearchengine.com";
        String apiKey = "abc123def456ghi789";
        int numSearchAds = 4;
        double searchAdRevenue = 1250.50;
        long indexSize = 450000L;
        System.out.println("Search Query: " + searchQuery);
        System.out.println("Search Results Count: " + searchResultsCount);
        System.out.println("Search Time: " + searchTime + " ms");
        System.out.println("User Location: " + userLocation);
        System.out.println("Ranking Algorithm: " + rankingAlgorithm);
        System.out.println("Search Engine Domain: " + searchEngineDomain);
        System.out.println("Search Engine API Key: " + apiKey);
        System.out.println("Number of Search Ads: " + numSearchAds);
        System.out.println("Search Ad Revenue: $" + searchAdRevenue);
        System.out.println("Search Engine Index Size: " + indexSize + " bytes");
    }
}
