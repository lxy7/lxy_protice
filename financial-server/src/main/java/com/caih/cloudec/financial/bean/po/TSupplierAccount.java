package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_supplier_account")
public class TSupplierAccount {


    @Id
    private String supplierAccountId;
    private String supplierId;
    private String accountNo;
    private String accountName;
    private String bankName;
    private String bankCode;
    private String status;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private String createUserId;
    private String updateUserId;
	public String getSupplierAccountId() {
		return supplierAccountId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public String getStatus() {
		return status;
	}
	public String getRemark() {
		return remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setSupplierAccountId(String supplierAccountId) {
		this.supplierAccountId = supplierAccountId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	
}