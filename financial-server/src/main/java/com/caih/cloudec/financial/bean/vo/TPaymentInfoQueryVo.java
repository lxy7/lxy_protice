package com.caih.cloudec.financial.bean.vo;


import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="TPaymentInfoVo对象", description="")
public class TPaymentInfoQueryVo {
    private String supplierId;
    private String operatorId;
    private String status;
    private Date createTime;
    private String phone;
    private String invoiceStatus;
    
    
	public String getPhone() {
		return phone;
	}
	public String getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public String getStatus() {
		return status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
 }

    