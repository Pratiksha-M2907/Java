package com.xworkz.inheritance.things;

public class EShopping {
	public String website;
    public String location;

    public EShopping() {
        System.out.println("Super class Eshopping");
    }
    
    public EShopping(String website, String location) {
        this.website = website;
        this.location = location;
    }

}
