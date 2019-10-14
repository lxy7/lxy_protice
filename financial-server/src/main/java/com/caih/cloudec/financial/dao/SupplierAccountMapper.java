package com.caih.cloudec.financial.dao;


import com.caih.cloudec.financial.bean.po.TSupplierAccount;




public interface SupplierAccountMapper {
   
    /**
     * 插入供应商账号
     * @return 
     */
    void insert(TSupplierAccount supplierAccount);
    /**
     * 更新供应商账号
     * @return 
     */
    void update(TSupplierAccount supplierAccount);
    /**
     * 删除供应商账号
     * @return 
     */
    void delete(String id);
}