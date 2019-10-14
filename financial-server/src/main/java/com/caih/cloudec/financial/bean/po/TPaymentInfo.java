package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_payment_info")
public class TPaymentInfo {


    @Id
    private String paymentInfoId;
    private String type;
    private String paymentOrderNo;
    private String sourceNo;
    private String storesId;
    private String supplierId;
    private String operatorId;
    private BigDecimal totalAmount;
    private String status;
    private Date createTime;
    private Date updateTime;
    private String createUserId;
    private String updateUserId;
    private Date sourceTime;
    private String phone;
    private String invoiceStatus;
    public Date getSourceTime() {
		return sourceTime;
	}
	public String getPhone() {
		return phone;
	}
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setSourceTime(Date sourceTime) {
		this.sourceTime = sourceTime;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getPaymentInfoId() {
		return paymentInfoId;
	}
	public void setPaymentInfoId(String paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPaymentOrderNo() {
		return paymentOrderNo;
	}
	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}
	public String getSourceNo() {
		return sourceNo;
	}
	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}
	public String getStoresId() {
		return storesId;
	}
	public void setStoresId(String storesId) {
		this.storesId = storesId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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