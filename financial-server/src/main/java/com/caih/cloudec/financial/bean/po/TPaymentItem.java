package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_payment_item")
public class TPaymentItem {

	@Id
	private String paymentItemId;
	private String paymentInfoId;
	private String paymentType;
	private String paymentName;
	private BigDecimal amount;
	private Date createTime;
	private Date updateTime;
	private String createUserId;
	private String updateUserId;
	private BigDecimal discount;// 优惠
	private BigDecimal unpaid;// 挂账
	private String invoiceId;// 发票号
	private TPaymentInfo paymentInfo;
	private TReceivablesPayablesOrder receivablesPayablesOrder;

	public BigDecimal getDiscount() {
		return discount;
	}

	public BigDecimal getUnpaid() {
		return unpaid;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public TPaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public TReceivablesPayablesOrder getReceivablesPayablesOrder() {
		return receivablesPayablesOrder;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public void setUnpaid(BigDecimal unpaid) {
		this.unpaid = unpaid;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setPaymentInfo(TPaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public void setReceivablesPayablesOrder(TReceivablesPayablesOrder receivablesPayablesOrder) {
		this.receivablesPayablesOrder = receivablesPayablesOrder;
	}

	public String getPaymentItemId() {
		return paymentItemId;
	}

	public void setPaymentItemId(String paymentItemId) {
		this.paymentItemId = paymentItemId;
	}

	public String getPaymentInfoId() {
		return paymentInfoId;
	}

	public void setPaymentInfoId(String paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

}