package com.caih.cloudec.financial.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caih.cloudec.financial.bean.po.TInvoiceInfo;
import com.caih.cloudec.financial.bean.po.TInvoiceItem;
import com.caih.cloudec.financial.dao.InvoiceInfoMapper;





@Service("invoiceInfoService")
public class InvoiceInfoService {
    
	@Autowired
    private InvoiceInfoMapper invoiceInfoMapper;

	public InvoiceInfoMapper getInvoiceInfoMapper() {
		return invoiceInfoMapper;
	}

	public void setInvoiceInfoMapper(InvoiceInfoMapper invoiceInfoMapper) {
		this.invoiceInfoMapper = invoiceInfoMapper;
	}

	
	public List<TInvoiceInfo> getInvoiceInfo(TInvoiceInfo invoiceInfo) {
		// TODO Auto-generated method stub
		return invoiceInfoMapper.querInvoice(invoiceInfo);
	}

	
	public List<TInvoiceItem> getInvoiceDetailedById(String id) {
		// TODO Auto-generated method stub
		return invoiceInfoMapper.findById(id);
	}

	
	public void insertInvoiceItem(TInvoiceItem invoiceItem) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.insertInvoiceItem(invoiceItem);
	}

	
	public void updateInvoiceItem(TInvoiceItem invoiceItem) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.updateInvoiceItem(invoiceItem);
		
	}

	
	public void deleteInvoiceItem(String id) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.deleteInvoiceItem(id);
	}

	
	public void insertInvoiceInfo(TInvoiceInfo invoiceInfo) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.insertInvoiceInfo(invoiceInfo);
	}

	
	public void updateInvoiceInfo(TInvoiceInfo invoiceInfo) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.updateInvoiceInfo(invoiceInfo);
	}

	
	public void deleteInvoiceInfo(String ids) {
		// TODO Auto-generated method stub
		invoiceInfoMapper.deleteInvoiceInfo(ids);
	}
	
}