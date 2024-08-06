package com.xworkz.inheritence.runner;
import com.xworkz.inheritance.things.*;
public class ElectronicGadgetsRunner {

	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		Smartphone s1 = new Smartphone("Samsung",40000,8);
		System.out.println("Brand: " + s1.brand + ", Price: " + s1.price + ", Storage: " + s1.storage);
	}
}
