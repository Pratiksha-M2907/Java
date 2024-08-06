package com.xworkz.inheritance.things;

public class OnlinePlatform extends EShopping {
    public String platformType;
    
    public OnlinePlatform() {
    	System.out.println("Onlineplatform is Subclass of EShopping");
    }
    
    public OnlinePlatform(String website, String location, String platformType) {
        super(website, location);
        this.platformType = platformType;

}
}