package com.elevati.web.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Entity
@Table(name = "elevate_order")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@DynamicUpdate
@Data
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long totalItems;
	
	private double totalPrice;
		
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
	private boolean confirmed;
	
	private long totalDiscount;
	
	private LocalDateTime processedAt;
	
	private String contactEmail;
	
	private String orderStatusUrl;
	
	private long userId;
	
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(long totalItems) {
		this.totalItems = totalItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public long getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(long totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public LocalDateTime getProcessedAt() {
		return processedAt;
	}

	public void setProcessedAt(LocalDateTime processedAt) {
		this.processedAt = processedAt;
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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
