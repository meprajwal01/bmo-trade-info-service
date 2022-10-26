package com.bmo.home.bmotradeinfoservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bmo.home.bmotradeinfoservice.model.Trade;
import com.bmo.home.bmotradeinfoservice.service.TradeService;

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;

	@GetMapping(value = "trade/{id}")
	public ResponseEntity<Trade> getTradeById(@PathVariable("id") Integer id) {

		Trade trade = tradeService.getTradeById(id);

		return ResponseEntity.ok(trade);
	}

	@PostMapping(value = "trade")
	public ResponseEntity<Trade> createTrade(@Valid @RequestBody Trade trade) {

		Trade result = tradeService.createTrade(trade);
		System.out.println("Saved Object : " + result);

		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{tradeId}").buildAndExpand(result.getTradeId()).toUri();
		return ResponseEntity.created(null).build();
	}

}
