package com.caih.cloudec.financial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TReceivablesPayablesOrder;
import com.caih.cloudec.financial.dao.ReceivablesPayablesOrderMapper;





@Service("receivablesPayablesOrderService")
@Transactional(readOnly = false)
public class ReceivablesPayablesOrderService  {
	
	@Autowired(required=true)
	private ReceivablesPayablesOrderMapper receivablesPayablesOrderMapper;
	
	public ReceivablesPayablesOrderMapper gettReceivablesPayablesOrderMapper() {
		return receivablesPayablesOrderMapper;
	}

	public void settReceivablesPayablesOrderMapper(ReceivablesPayablesOrderMapper tReceivablesPayablesOrderMapper) {
		this.receivablesPayablesOrderMapper = tReceivablesPayablesOrderMapper;
	}

	
	public List<TReceivablesPayablesOrder> queryReceivablesOrderList(
			TReceivablesPayablesOrder receivablesPayablesOrder) {
		return receivablesPayablesOrderMapper.queryReceivablesOrder(receivablesPayablesOrder);
	}

	public List<TReceivablesPayablesOrder> queryPayablesOrderList(
			TReceivablesPayablesOrder receivablesPayablesOrder) {
		return receivablesPayablesOrderMapper.queryPayablesOrder(receivablesPayablesOrder);
	}
	
	public List<TPaymentInfo> queryPaymentById(String Id){
		return receivablesPayablesOrderMapper.queryDetailedById(Id);
	}
	
	public void insert(TReceivablesPayablesOrder receivablesPayablesOrder) {
		receivablesPayablesOrderMapper.insert(receivablesPayablesOrder);
		
	}

	
	public void update(TReceivablesPayablesOrder receivablesPayablesOrder) {
		// TODO Auto-generated method stub
		receivablesPayablesOrderMapper.update(receivablesPayablesOrder);
	}

	
	public void delete(String id) {
		// TODO Auto-generated method stub
		receivablesPayablesOrderMapper.delete(id);
	}

	
	public String getPaymentStatus(String id) {
		// TODO Auto-generated method stub
		return receivablesPayablesOrderMapper.queryStatus(id);
	}

}
