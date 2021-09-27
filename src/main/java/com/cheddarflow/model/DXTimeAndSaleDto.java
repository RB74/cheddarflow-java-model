package com.cheddarflow.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DXTimeAndSaleDto implements Created {

	private String symbol;
	private String dataset;
	private String dateString;
	private String timeString;
	private String volumeFormatted;
	private boolean lateSignature;
	private Double shareCost;
	private Double price;
	private Double totalShareCostFormatted;
	private String exchangeSaleConditions;
	private Date createdAt;
	private Date receivedOn;

	public DXTimeAndSaleDto(DXTimeAndSale dXTimeAndSale) {
		this.symbol = dXTimeAndSale.getSymbol();
		this.price = dXTimeAndSale.getPrice();
		this.dataset = dXTimeAndSale.getDataset();
		this.dateString = dXTimeAndSale.getDateString();
		this.timeString = dXTimeAndSale.getTimeString();
		this.volumeFormatted = dXTimeAndSale.getVolumeFormatted();
		this.shareCost = dXTimeAndSale.getTotalShareCost();
		this.totalShareCostFormatted = dXTimeAndSale.getTotalShareCost();
		this.exchangeSaleConditions = dXTimeAndSale.getExchangeSaleConditions();
		this.lateSignature = dXTimeAndSale.isLateSignature();
		this.createdAt = dXTimeAndSale.getCreatedOn();
		this.receivedOn = dXTimeAndSale.getReceivedOn();
	}

	public String getSymbol() {
		return symbol;
	}

	public String getDataset() {
		return dataset;
	}

	public String getDateString() {
		return dateString;
	}

	public String getTimeString() {
		return timeString;
	}

	public String getVolumeFormatted() {
		return volumeFormatted;
	}

	public boolean isLateSignature() {
		return lateSignature;
	}

	public Double getShareCost() {
		return shareCost;
	}

	public Double getPrice() {
		return price;
	}

	public Double getTotalShareCostFormatted() {
		return totalShareCostFormatted;
	}

	public String getExchangeSaleConditions() {
		return exchangeSaleConditions;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getReceivedOn() {
		return receivedOn;
	}

	@Override
	@JsonProperty("createdAt")
	public Date getCreatedOn() {
		return this.createdAt;
	}

}