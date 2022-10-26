package com.bmo.home.bmotradeinfoservice.exception;

import java.time.LocalDateTime;

public class TradeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8724811626696714507L;
	private LocalDateTime localDateTime;
	private String message;
	private String details;

	public TradeException() {
	}

	public TradeException(LocalDateTime localDateTime, String message, String details) {
		super();
		this.localDateTime = localDateTime;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
