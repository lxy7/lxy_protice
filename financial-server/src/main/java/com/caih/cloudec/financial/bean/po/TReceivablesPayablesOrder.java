package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_receivables_payables_order")
public class TReceivablesPayablesOrder {

	@Id
	private String rpOrderId;
	private String orderNo;
	private String storesId;
	private String sourceOrderNo;
	private String sourceType;
	private String orderType;
	private BigDecimal totalAmount;
	private String tranObject;
	private BigDecimal unpaidAmount;
	private BigDecimal paidAmount;
	private String reviewStatus;
	private String paymentStatus;
	private Date createTime;
	private Date updateTime;
	private String createUserId;
	private String updateUserId;
	private String status;
	private Date sourceOrderTime;
	private String financial;

	public Date getsourceOrderTime() {
		return sourceOrderTime;
	}

	public String getFinancial() {
		return financial;
	}

	public void setsourceOrderTime(Date sourceOrderTime) {
		this.sourceOrderTime = sourceOrderTime;
	}

	public void setFinancial(String financial) {
		this.financial = financial;
	}

	public String getRpOrderId() {
		return rpOrderId;
	}

	public void setRpOrderId(String rpOrderId) {
		this.rpOrderId = rpOrderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getStoresId() {
		return storesId;
	}

	public void setStoresId(String storesId) {
		this.storesId = storesId;
	}

	public String getsourceOrderNo() {
		return sourceOrderNo;
	}

	public void setsourceOrderNo(String sourceOrderNo) {
		this.sourceOrderNo = sourceOrderNo;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTranObject() {
		return tranObject;
	}

	public void setTranObject(String tranObject) {
		this.tranObject = tranObject;
	}

	public BigDecimal getUnpaidAmount() {
		return unpaidAmount;
	}

	public void setUnpaidAmount(BigDecimal unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}