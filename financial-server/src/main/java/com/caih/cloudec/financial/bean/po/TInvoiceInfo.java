package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_invoice_info")
public class TInvoiceInfo {


    @Id
    private String invoiceInfoId;
    private String storesId;
    private String invoiceInfoOrder;
    private String invoiceNo;
    private String lookedUp;
    private String person;
    private String invoiceType;
    private BigDecimal taxRate;
    private String taxNo;
    private String phone;
    private String address;
    private String accountNo;
    private String bankName;
    private String remark;
    private String reviewStatus;
    private Date invoiceDate;
    private String status;
    private Date createTime;
    private Date updateTime;
    private String createUserId;
    private String updateUserId;
	public String getInvoiceInfoId() {
		return invoiceInfoId;
	}
	public void setInvoiceInfoId(String invoiceInfoId) {
		this.invoiceInfoId = invoiceInfoId;
	}
	public String getStoresId() {
		return storesId;
	}
	public void setStoresId(String storesId) {
		this.storesId = storesId;
	}
	public String getInvoiceInfoOrder() {
		return invoiceInfoOrder;
	}
	public void setInvoiceInfoOrder(String invoiceInfoOrder) {
		this.invoiceInfoOrder = invoiceInfoOrder;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getLookedUp() {
		return lookedUp;
	}
	public void setLookedUp(String lookedUp) {
		this.lookedUp = lookedUp;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getReviewStatus() {
		return reviewStatus;
	}
	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
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