package com.caih.cloudec.financial.bean.vo;


import io.swagger.annotations.ApiModel;
import java.util.Date;

@ApiModel(value="TInvoiceInfoVo对象", description="")
public class TInvoiceInfoQueryVo {
	
    private String invoiceInfoOrder;
    private String invoiceNo;
    private String lookedUp;
    private String person;
    private String invoiceType;
    private Date invoiceDate;
	public String getInvoiceInfoOrder() {
		return invoiceInfoOrder;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public String getLookedUp() {
		return lookedUp;
	}
	public String getPerson() {
		return person;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceInfoOrder(String invoiceInfoOrder) {
		this.invoiceInfoOrder = invoiceInfoOrder;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setLookedUp(String lookedUp) {
		this.lookedUp = lookedUp;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
    
}

    