package com.elevati.web.Bean;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Order {
	
	private long id;
	private String email;
	private String createdAt;
	private String updatedAt;
	private long number;
	private double totalPrice;
	private boolean confirmed;
	private String name;
	private double totalPriceUsd;
	private long userId;
	private String processedAt;
	private long appId;
	private long orderNumber;
	private String contactEmail;
	private String orderStatusUrl;
	private double totalDiscount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalPriceUsd() {
		return totalPriceUsd;
	}
	public void setTotalPriceUsd(double totalPriceUsd) {
		this.totalPriceUsd = totalPriceUsd;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getProcessedAt() {
		return processedAt;
	}
	public void setProcessedAt(String processedAt) {
		this.processedAt = processedAt;
	}
	public long getAppId() {
		return appId;
	}
	public void setAppId(long appId) {
		this.appId = appId;
	}
	public long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getOrderStatusUrl() {
		return orderStatusUrl;
	}
	public void setOrderStatusUrl(String orderStatusUrl) {
		this.orderStatusUrl = orderStatusUrl;
	}
	public double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	
	
	}
