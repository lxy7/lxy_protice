package com.caih.cloudec.financial.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caih.cloudec.financial.bean.po.TInvoiceInfo;
import com.caih.cloudec.financial.bean.po.TInvoiceItem;
import com.caih.cloudec.financial.bean.po.TSupplierAccount;
import com.caih.cloudec.financial.dao.InvoiceInfoMapper;
import com.caih.cloudec.financial.dao.SupplierAccountMapper;





@Service("supperAccountService")
public class SupplierAccountService  {

	
	@Autowired
	private SupplierAccountMapper supplierAccountMapper;
	
	public SupplierAccountMapper getSupplierAccountMapper() {
		return supplierAccountMapper;
	}

	public void setSupplierAccountMapper(SupplierAccountMapper supplierAccountMapper) {
		this.supplierAccountMapper = supplierAccountMapper;
	}

	
	public void insertSupplierAccount(TSupplierAccount supplierAccount) {
		// TODO Auto-generated method stub
		supplierAccountMapper.insert(supplierAccount);
		
	}

	
	public void updateSupplierAccount(TSupplierAccount supplierAccount) {
		// TODO Auto-generated method stub
		supplierAccountMapper.update(supplierAccount);
	}

	
	public void deleteSupplierAccount(String id) {
		// TODO Auto-generated method stub
		supplierAccountMapper.delete(id);
	}
    
	
  
}