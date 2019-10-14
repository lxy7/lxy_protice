package com.caih.cloudec.financial.dao;

import java.util.List;

import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TReceivablesPayablesOrder;

public interface ReceivablesPayablesOrderMapper {

	/**
	 * 查询应收款单
	 * 
	 * @return
	 */
	public List<TReceivablesPayablesOrder> queryReceivablesOrder(TReceivablesPayablesOrder receivablesPayablesOrder);

	/**
	 * 查询应付款单
	 * 
	 * @return
	 */
	public List<TReceivablesPayablesOrder> queryPayablesOrder(TReceivablesPayablesOrder receivablesPayablesOrder);

	/**
	 * 根据应付款单号查询收付款单
	 * 
	 * @return
	 */
	public List<TPaymentInfo> queryDetailedById(String id);
	/**
	 * 插入应收付款单
	 * 
	 * @return
	 */
	public void insert(TReceivablesPayablesOrder receivablesPayablesOrder);

	/**
	 * 更新应收付款单
	 * 
	 * @return
	 */
	public void update(TReceivablesPayablesOrder receivablesPayablesOrder);
	
	

	/**
	 * 删除应收付款单
	 * 
	 * @return
	 */
	public void delete(String id);

	/**
	 * 根据id查询结算状态
	 * 
	 * @return
	 */
	public String queryStatus(String id);
}
