package com.caih.cloudec.financial.bean.po;

import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_invoice_item")
public class TInvoiceItem {


    @Id
    private String invoiceItemId;
    private String invoiceInfoId;
    private String materialId;
    private String materialName;
    private String materialTypeName;
    private String unitName;
    private int number;
    private BigDecimal unitPrice;
    private BigDecimal totalAmount;
	private BigDecimal taxRate;
	private BigDecimal taxAmount;
	private Date createTime;
    private Date updateTime;
    private String createUserId;
    private String updateUserId;
	public String getInvoiceItemId() {
		return invoiceItemId;
	}
	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}
	public String getInvoiceInfoId() {
		return invoiceInfoId;
	}
	public void setInvoiceInfoId(String invoiceInfoId) {
		this.invoiceInfoId = invoiceInfoId;
	}
	public String getMaterialId() {
		return materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialTypeName() {
		return materialTypeName;
	}
	public void setMaterialTypeName(String materialTypeName) {
		this.materialTypeName = materialTypeName;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
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