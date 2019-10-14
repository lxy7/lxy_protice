package com.caih.cloudec.financial.bean.vo;


import io.swagger.annotations.ApiModel;

import java.math.BigDecimal;
import java.util.Date;

@ApiModel(value="TReceivablesPayablesOrderVo对象", description="")
public class TReceivablesPayablesOrderQueryVo {
	private String reviewStatus;
    private String paymentStatus;
    private String tranObject;
	private Date createTime;
	
	public String getTranObject() {
		return tranObject;
	}
	public void setTranObject(String tranObject) {
		this.tranObject = tranObject;
	}
	public String getReviewStatus() {
		return reviewStatus;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
  
 }

    