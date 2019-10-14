package com.caih.cloudec.financial.dao;



import java.util.List;

import com.caih.cloudec.financial.bean.po.TInvoiceInfo;
import com.caih.cloudec.financial.bean.po.TInvoiceItem;




public interface InvoiceInfoMapper {
   
    
    /**
     * 查询所有开票信息
     * @return list
     */
    List<TInvoiceInfo> querInvoice(TInvoiceInfo invoiceInfo);
    /**
     * 根据id查询开票信息详情
     * @return list
     */
    List<TInvoiceItem> findById(String id);
    /**
     * 插入开票详情信息
     * @return 
     */
    void insertInvoiceItem(TInvoiceItem invoiceItem);
    /**
     * 更新开票详情信息
     * @return 
     */
    void updateInvoiceItem(TInvoiceItem invoiceItem);
    /**
     * 删除开票详情信息
     * @return 
     */
    void deleteInvoiceItem(String ids);
    
    /**
     * 插入开票信息
     * @return 
     */
    void insertInvoiceInfo(TInvoiceInfo invoiceInfo);
    /**
     * 更新开票详情信息
     * @return 
     */
    void updateInvoiceInfo(TInvoiceInfo invoiceInfo);
    /**
     * 删除开票详情信息
     * @return 
     */
    void deleteInvoiceInfo(String ids);
}