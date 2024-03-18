package com.sdw.auction;

public class Main {

	public static void main(String[] args) {
		
		AuctionMediator auction = new Auction();
		
		Colleague bidder1 = new Bidder("A", auction);
		Colleague bidder2 = new Bidder("B", auction);
		
		bidder1.placeBid(2000);
		bidder2.placeBid(4000);
		bidder1.placeBid(10000);

	}

}
