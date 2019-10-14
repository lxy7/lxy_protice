package com.caih.cloudec.financial.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TPaymentItem;




public interface PayInfoMapper {
   
    
    /**
     * 查询所有付款信息
     * @return list
     */
    List<TPaymentInfo> queryPaymentInfo(TPaymentInfo paymentInfo);
    /**
     * 查询所有收款信息
     * @return list
     */
    List<TPaymentInfo> queryReceivceInfo(TPaymentInfo paymentInfo);
    /**
     * 根据id查询收付款详情
     * @return list
     */
    List<TPaymentItem> findById(String id);
    /**
     * 根据id更新审核状态
     * @return list
     */
    public void updateStatus(@Param("id")String id,@Param("status")String status);
    
    /**
     * 插入收付款详情信息
     * @return
     */
    void insertPaymentItem(TPaymentItem paymentItem);
    /**
     * 更新收付款详情信息
     * @return
     */
    void updatePaymentItem(TPaymentItem paymentItem);
    /**
     * 删除收付款详情信息
     * @return
     */
    void deletePaymentItem(String id);
    /**
     * 插入收付款信息
     * @return
     */
    void insertPaymentInfo(TPaymentInfo paymentInfo);
    /**
     * 更新收付款信息
     * @return
     */
    void updatePaymentInfo(TPaymentInfo paymentInfo);
    /**
     * 删除收付款信息
     * @return
     */
    void deletePaymentInfo(String id);


    
}