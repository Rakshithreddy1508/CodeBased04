package com.lulu.SportsProductShop.Management.entity;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sports_product")
public class PurchaseEntity {

	@Id
	int id;
	String productName;
	double cost;
	Date purchaseDate;
	Date deliveryDate;
	String customerFeedback;
	public PurchaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseEntity(int id, String productName, double cost, Date purchaseDate, Date deliveryDate,
			String customerFeedback) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.purchaseDate = purchaseDate;
		this.deliveryDate = deliveryDate;
		this.customerFeedback = customerFeedback;
	}
	@Override
	public String toString() {
		return "PurchaseEntity [id=" + id + ", productName=" + productName + ", cost=" + cost + ", purchaseDate="
				+ purchaseDate + ", deliveryDate=" + deliveryDate + ", customerFeedback=" + customerFeedback + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getCustomerFeedback() {
		return customerFeedback;
	}
	public void setCustomerFeedback(String customerFeedback) {
		this.customerFeedback = customerFeedback;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cost, customerFeedback, deliveryDate, id, productName, purchaseDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PurchaseEntity other = (PurchaseEntity) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
				&& Objects.equals(customerFeedback, other.customerFeedback)
				&& Objects.equals(deliveryDate, other.deliveryDate) && id == other.id
				&& Objects.equals(productName, other.productName) && Objects.equals(purchaseDate, other.purchaseDate);
	}

}