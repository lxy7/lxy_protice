package com.caih.cloudec.financial.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caih.cloudec.financial.bean.po.TReceivablesPayablesOrder;
import com.caih.cloudec.financial.service.ITReceivablesPayablesOrderService;





@Controller
@RequestMapping("/tTReceivablesPayablesOrder")
public class TReceivablesPayablesOrderController {
	
	@Autowired
	private ITReceivablesPayablesOrderService receivablesPayablesOrderService;

	public ITReceivablesPayablesOrderService gettReceivablesPayablesOrderService() {
		return receivablesPayablesOrderService;
	}

	public void settReceivablesPayablesOrderService(ITReceivablesPayablesOrderService tReceivablesPayablesOrderService) {
		this.receivablesPayablesOrderService = tReceivablesPayablesOrderService;
	}
	
	@RequestMapping("/getReceivablesOrderListByStoresId")
	public String getReceivablesOrderListByStoresId(Model model,String storesId){
		TReceivablesPayablesOrder tReceivablesPayablesOrder = new TReceivablesPayablesOrder();
		tReceivablesPayablesOrder.setStoresId("22");
		tReceivablesPayablesOrder.setOrderType("22");
		List<TReceivablesPayablesOrder> list = receivablesPayablesOrderService.queryTReceivablesPayablesOrderList(tReceivablesPayablesOrder);
		model.addAttribute("receivablesPayablesOrderList", list);
		System.out.println(list.toString());
		return "tReceivablesPayablesOrderList";
	}
	
	@RequestMapping("/insert")
	public Object insert(HttpServletRequest request){
		TReceivablesPayablesOrder receivablesPayablesOrder=new TReceivablesPayablesOrder();
		receivablesPayablesOrder.setRpOrderId("111");
		receivablesPayablesOrder.setPaymentStatus("11");
		receivablesPayablesOrder.setCreateTime(new Date());
		receivablesPayablesOrderService.insert(receivablesPayablesOrder);
		return null;
	}
	@RequestMapping("/update")
	public Object update(HttpServletRequest request){
		TReceivablesPayablesOrder receivablesPayablesOrder=new TReceivablesPayablesOrder();
		receivablesPayablesOrder.setRpOrderId("111");
		receivablesPayablesOrder.setPaymentStatus("00");
		receivablesPayablesOrder.setUpdateTime(new Date());
		receivablesPayablesOrderService.update(receivablesPayablesOrder);
		return null;
	}
	@RequestMapping("/delete")
	public Object delete(HttpServletRequest request){
		receivablesPayablesOrderService.delete("111");
		return null;
	}
	@RequestMapping("/getPaymentStatus")
	public Object getPaymentStatus(HttpServletRequest request){
		return receivablesPayablesOrderService.getPaymentStatus("111");
	}
	
}
