package com.xworkz.inheritance.things;

public class ElectronicGadgets{
	public String brand;
    public double price;
    
    public ElectronicGadgets() {
    	System.out.println("Super Class Electronic Gadgets");
    }
    
    public ElectronicGadgets(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

