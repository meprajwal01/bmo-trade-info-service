package com.bmo.home.bmotradeinfoservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TradeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9016174476951950792L;

	public TradeNotFoundException(String message) {
		super(message);
	}

}
