class Inventory {
	public static void main(String args[]){
    String[] itemNames = {"Item A", "Item B", "Item C"};
    int[] quantities = {100, 200, 150};
    long[] inventoryIds = {10L, 20L, 30L};
    char[] locations = {'L', 'M', 'N'};

    for (int s=0; s<itemNames.length; s++) {
        System.out.println("Item names: " + itemNames[s]);
        System.out.println("Quantities: " + quantities[s]);
        System.out.println("InventoryIds: " + inventoryIds[s]);
        System.out.println("Locations: " + locations[s]);
		System.out.println("\n");
    }
}
}