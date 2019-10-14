package com.caih.cloudec.financial.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TPaymentItem;
import com.caih.cloudec.financial.dao.PayInfoMapper;




@Service("payInfoService")
public class PayInfoService  {
    
	@Autowired
    private PayInfoMapper payInfoMapper;



	public PayInfoMapper getPayInfoMapper() {
		return payInfoMapper;
	}

	public void setPayInfoMapper(PayInfoMapper payInfoMapper) {
		this.payInfoMapper = payInfoMapper;
	}
	
	public List<TPaymentInfo> getPayInfo(TPaymentInfo paymentInfo) {
		// TODO Auto-generated method stub
		return payInfoMapper.queryPaymentInfo(paymentInfo);
	}
	
	public List<TPaymentInfo> getReceivceInfo(TPaymentInfo paymentInfo) {
		// TODO Auto-generated method stub
		return payInfoMapper.queryReceivceInfo(paymentInfo);
	}
	
	public List<TPaymentItem> getPayDetailedById(String id) {
		// TODO Auto-generated method stub
		return payInfoMapper.findById(id);
	}

	
	public void insertPaymentItem(TPaymentItem paymentItem) {
		payInfoMapper.insertPaymentItem(paymentItem);

	}

	
	public void updatePaymentItem(TPaymentItem paymentItem) {
        payInfoMapper.updatePaymentItem(paymentItem);
	}

	
	public void deletePaymentItem(String id) {
		payInfoMapper.deletePaymentItem(id);
	}

	
	public void insertPaymentInfo(TPaymentInfo paymentInfo) {
		// TODO Auto-generated method stub
		payInfoMapper.insertPaymentInfo(paymentInfo);
	}

	
	public void updatePaymentInfo(TPaymentInfo paymentInfo) {
		// TODO Auto-generated method stub
		payInfoMapper.updatePaymentInfo(paymentInfo);
	}

	
	public void deletePaymentInfo(String id) {
		// TODO Auto-generated method stub
		 payInfoMapper.deletePaymentInfo(id);
	}

	public void updateStatus(String id,String status){
		payInfoMapper.updateStatus(id,status);
	}
}
