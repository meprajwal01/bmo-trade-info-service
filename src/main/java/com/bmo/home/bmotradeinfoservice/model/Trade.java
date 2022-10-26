package com.bmo.home.bmotradeinfoservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Positive;

@Entity
public class Trade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1571567466295891946L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tradeId;

	@Positive(message = "Quantity should be positive value & greater then 0")
	private Integer quantity;

	public Trade() {
	}

	public Trade(int tradeId, Integer quantity) {
		super();
		this.tradeId = tradeId;
		this.quantity = quantity;
	}

	public int getTradeId() {
		return tradeId;
	}

	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
