package com.xworkz.inheritance.things;

public class OnlineMarket extends OnlinePlatform{

	public int sellerCount;

	public OnlineMarket() {
		System.out.println("Online market is subclass of OnlinePlatform ");
	}

	public OnlineMarket(String website, String location, String platformType,int sellerCount) {
		super(website, location, platformType);
		this.sellerCount=sellerCount;
	}
}
