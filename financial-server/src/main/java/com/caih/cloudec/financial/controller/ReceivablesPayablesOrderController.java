package com.caih.cloudec.financial.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caih.cloudec.common.DICT;
import com.caih.cloudec.common.bean.Page;
import com.caih.cloudec.common.bean.ResultObj;
import com.caih.cloudec.common.utils.UuidUtil;
import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TReceivablesPayablesOrder;
import com.caih.cloudec.financial.bean.vo.TPaymentInfoQueryVo;
import com.caih.cloudec.financial.bean.vo.TReceivablesPayablesOrderQueryVo;
import com.caih.cloudec.financial.service.ReceivablesPayablesOrderService;
import com.github.pagehelper.PageHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

@Slf4j
@Validated
@Api(value = "/clouded/financial/recePayOrder", tags = "ReceivablesPayablesOrderController", description = "应收付款信息",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping("/clouded/financial/recePayOrder")
public class ReceivablesPayablesOrderController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private ReceivablesPayablesOrderService receivablesPayablesOrderService;

	
	@PostMapping(value = "/getReceivablesOrder",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "获取应收款列表",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Object getReceivablesOrder(@RequestBody TReceivablesPayablesOrderQueryVo receivablesPayablesOrderQueryVo,
			@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
		logger.info("请求参数：【" + receivablesPayablesOrderQueryVo + "】");
		Page page = new Page();
		ResultObj resultObj = new ResultObj();
		TReceivablesPayablesOrder receivablesPayablesOrder = new TReceivablesPayablesOrder();
		try {
			BeanUtils.copyProperties(receivablesPayablesOrderQueryVo, receivablesPayablesOrder);
			PageHelper.startPage(pageNo, pageSize, true);
			List<TReceivablesPayablesOrder> receivablesOrders = receivablesPayablesOrderService.queryReceivablesOrderList(receivablesPayablesOrder);
			if (!receivablesOrders.isEmpty()) {
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
				com.github.pagehelper.PageInfo<TReceivablesPayablesOrder> pageInfo = new com.github.pagehelper.PageInfo<>(
						receivablesOrders);
				page.setDataList(pageInfo.getList());
				page.setPageNo(pageInfo.getPageNum());
				page.setPageSize(pageInfo.getPageSize());
				page.setTotalPage(pageInfo.getPages());
				page.setTotalCount((int) pageInfo.getTotal());
			}
			resultObj.setPage(page);
			return resultObj;
		} catch (BeansException e) {
			e.printStackTrace();
			resultObj.setCode(DICT.ERROR[0]);
			resultObj.setCodeMsg(DICT.ERROR[1]);
		}

		return resultObj;
	}
	
	@PostMapping(value = "/getPayablesOrder",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "获取应付款列表",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Object getPayablesOrder(@RequestBody TReceivablesPayablesOrderQueryVo receivablesPayablesOrderQueryVo,
			@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
		logger.info("请求参数：【" + receivablesPayablesOrderQueryVo + "】");
		Page page = new Page();
		ResultObj resultObj = new ResultObj();
		TReceivablesPayablesOrder receivablesPayablesOrder = new TReceivablesPayablesOrder();
		try {
			BeanUtils.copyProperties(receivablesPayablesOrderQueryVo, receivablesPayablesOrder);
			PageHelper.startPage(pageNo, pageSize, true);
			List<TReceivablesPayablesOrder> receivablesOrders = receivablesPayablesOrderService.queryPayablesOrderList(receivablesPayablesOrder);
			if (!receivablesOrders.isEmpty()) {
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
				com.github.pagehelper.PageInfo<TReceivablesPayablesOrder> pageInfo = new com.github.pagehelper.PageInfo<>(
						receivablesOrders);
				page.setDataList(pageInfo.getList());
				page.setPageNo(pageInfo.getPageNum());
				page.setPageSize(pageInfo.getPageSize());
				page.setTotalPage(pageInfo.getPages());
				page.setTotalCount((int) pageInfo.getTotal());
			}
			resultObj.setPage(page);
			return resultObj;
		} catch (BeansException e) {
			e.printStackTrace();
			resultObj.setCode(DICT.ERROR[0]);
			resultObj.setCodeMsg(DICT.ERROR[1]);
		}

		return resultObj;
	}
	
	 
	@ApiOperation(value = "根据单号获取收付款信息", notes="", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "orderNo", value = "单号", required = true, dataType = "String")
	})
	@GetMapping(value = "/getDetail", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResultObj getTSaleInfoDetail(@RequestParam("orderNo") String orderNo){
		ResultObj resultObj=new ResultObj();
		List<TPaymentInfo> paymentInfos = receivablesPayablesOrderService.queryPaymentById(orderNo);
		if (paymentInfos.size()>0){
			resultObj.setCode(DICT.SUCCESS[0]);
			resultObj.setCodeMsg(DICT.SUCCESS[1]);
			resultObj.setData(paymentInfos);
			return resultObj;
		}
		resultObj.setCode(DICT.ERROR[0]);
		resultObj.setCodeMsg(DICT.ERROR[1]);
		return resultObj;
	}
		@PostMapping(value = "/addRecePayOrder")
		@ApiOperation(value = "新增应收付款", notes = "新增应收付款")
		public ResultObj<?> addRecePayOrder(TReceivablesPayablesOrder receivablesPayablesOrder) {
			ResultObj resultObj = new ResultObj();
			try {
				receivablesPayablesOrder.setRpOrderId(UuidUtil.getUuid());
				receivablesPayablesOrderService.insert(receivablesPayablesOrder);
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
				return resultObj;
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultObj.setCode(DICT.ERROR[0]);
			resultObj.setCodeMsg(DICT.ERROR[1]);
			return resultObj;
		}

	    
	   
	    
	    
	   	@PostMapping(value = "/updateRecePayOrder")
	   	@ApiOperation(value = "根据id修改应收付款", notes = "根据id修改应收付款")
	   	public ResultObj<?> updateRecePayOrder(@RequestBody TReceivablesPayablesOrder receivablesPayablesOrder) {
	   		ResultObj resultObj = new ResultObj();
	   		try {
	   			receivablesPayablesOrderService.update(receivablesPayablesOrder);
	   			resultObj.setCode(DICT.SUCCESS[0]);
	   			resultObj.setCodeMsg(DICT.SUCCESS[1]);
	   			return resultObj;
	   		} catch (Exception e) {
	   			e.printStackTrace();
	   		}
	   		resultObj.setCode(DICT.ERROR[0]);
	   		resultObj.setCodeMsg(DICT.ERROR[1]);
	   		return resultObj;
	   	}

	    
	   	@PostMapping(value = "/deleteRecePayOrder")
	   	@ApiOperation(value = "根据id删除应收付款", notes = "根据id删除应收付款")
	    @ApiImplicitParams({
			@ApiImplicitParam(name = "rPOrderId", value = "收付款id", required = true, dataType = "String") })
	   	public ResultObj<?> deleteRecePayOrder(@RequestParam("rPOrderId") String rPOrderId) {
	   		ResultObj resultObj = new ResultObj();
	   		try {
	   			receivablesPayablesOrderService.delete(rPOrderId);
	   			resultObj.setCode(DICT.SUCCESS[0]);
	   			resultObj.setCodeMsg(DICT.SUCCESS[1]);
	   			return resultObj;
	   		} catch (Exception e) {
	   			e.printStackTrace();
	   		}
	   		resultObj.setCode(DICT.ERROR[0]);
	   		resultObj.setCodeMsg(DICT.ERROR[1]);
	   		return resultObj;
	   	}
	    

}
