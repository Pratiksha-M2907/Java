package com.xworkz.inheritance.things;

public class Smartphone extends ElectronicGadgets{
	public int storage;
	
	public Smartphone(){
		System.out.println("Sub class Smartphone");
	}
	
	public Smartphone(String brand, double price, int storage) {
        super(brand, price);
        this.storage = storage;
    }


}
