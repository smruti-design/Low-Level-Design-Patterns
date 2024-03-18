package com.sdw.auction;

public class Bidder implements Colleague {
	
	String name;
	AuctionMediator auction;
	
	public Bidder(String name, AuctionMediator auction) {
		
		this.name = name;
		this.auction = auction;
		auction.addBidder(this);
	}

	

	@Override
	public void placeBid(int bidAmount) {
		auction.placeBid(this, bidAmount);
		
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		System.out.println("Bidder: "+" got the notification that someone has put the bid of : "+ bidAmount);
	}

	@Override
	public String getName() {
		
		return name;
	}

}
