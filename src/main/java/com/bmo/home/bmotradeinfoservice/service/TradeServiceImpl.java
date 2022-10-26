/**
 * 
 */
package com.bmo.home.bmotradeinfoservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmo.home.bmotradeinfoservice.exception.TradeNotFoundException;
import com.bmo.home.bmotradeinfoservice.model.Trade;
import com.bmo.home.bmotradeinfoservice.repo.TradeRepo;

/**
 * @author psharma408
 *
 */
@Service
public class TradeServiceImpl implements TradeService {

	@Autowired
	private TradeRepo tradeRepo;

	@Override
	public Trade getTradeById(Integer id) {
		Optional<Trade> trade = tradeRepo.findById(id);

		return trade.orElseThrow(() -> new TradeNotFoundException("Trade Not Found"));

	}

	@Override
	public Trade createTrade(Trade trade) {

		return tradeRepo.save(trade);
	}

}
