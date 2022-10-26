package com.bmo.home.bmotradeinfoservice.service;

import com.bmo.home.bmotradeinfoservice.model.Trade;

public interface TradeService {

	Trade getTradeById(Integer id);
	
	Trade createTrade(Trade trade);

}
