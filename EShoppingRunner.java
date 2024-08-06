package com.xworkz.inheritence.runner;
import com.xworkz.inheritance.things.*;
public class EShoppingRunner {
	public static void main(String[] args) {
		OnlineMarket o= new OnlineMarket();
		OnlineMarket o1=new OnlineMarket("Amazon","U.S","E-com",205884);
		System.out.println("Website: " + o1.website + ", Location: " + o1.location + ", Platform Type: " + o1.platformType + ", Seller Count: " + o1.sellerCount);
	}
}
