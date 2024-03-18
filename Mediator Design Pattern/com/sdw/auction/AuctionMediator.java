package com.sdw.auction;

public interface AuctionMediator {
	
	void addBidder(Colleague bidder);
	void placeBid(Colleague bidder, int bidAmount);

}
