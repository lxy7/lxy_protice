package com.caih.cloudec.financial.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.caih.cloudec.common.DICT;
import com.caih.cloudec.common.PageInfo;
import com.caih.cloudec.common.Result;
import com.caih.cloudec.common.bean.Page;
import com.caih.cloudec.common.bean.ResultObj;
import com.caih.cloudec.common.utils.UuidUtil;
import com.caih.cloudec.financial.bean.po.TInvoiceInfo;
import com.caih.cloudec.financial.bean.po.TInvoiceItem;
import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TPaymentItem;
import com.caih.cloudec.financial.bean.vo.TInvoiceInfoQueryVo;
import com.caih.cloudec.financial.bean.vo.TPaymentInfoQueryVo;
import com.caih.cloudec.financial.service.PayInfoService;
import com.github.pagehelper.PageHelper;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/clouded/financial/payInfo")
@Api(value="/clouded/financial/payInfo",description="收付款信息",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PayInfoController {
    
	protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
	private PayInfoService payInfoService;
    
    @PostMapping(value = "/getReceivceInfo")
    @ApiOperation(value="获取收款信息列表")
    public Object getReceivceInfo(@RequestBody TPaymentInfoQueryVo paymentInfoQueryVo,
			@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
		logger.info("请求参数：【" + paymentInfoQueryVo + "】");
		Page page = new Page();
		ResultObj resultObj = new ResultObj();
		TPaymentInfo paymentInfo = new TPaymentInfo();
		try {
			BeanUtils.copyProperties(paymentInfoQueryVo, paymentInfo);
			PageHelper.startPage(pageNo, pageSize, true);
			List<TPaymentInfo> receivceInfos = payInfoService.getReceivceInfo(paymentInfo);
			com.github.pagehelper.PageInfo<TPaymentInfo> pageInfo = new com.github.pagehelper.PageInfo<TPaymentInfo>(receivceInfos);
			if (!receivceInfos.isEmpty()) {
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
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


    @PostMapping(value = "/getPaymentInfo")
    @ApiOperation(value="获取付款信息列表")
    public Object getPaymentInfo(@RequestBody TPaymentInfoQueryVo paymentInfoQueryVo,
			@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
		logger.info("请求参数：【" + paymentInfoQueryVo + "】");
		Page page = new Page();
		ResultObj resultObj = new ResultObj();
		TPaymentInfo paymentInfo = new TPaymentInfo();
		try {
			BeanUtils.copyProperties(paymentInfoQueryVo, paymentInfo);
			PageHelper.startPage(pageNo, pageSize, true);
			List<TPaymentInfo> paymentInfos = payInfoService.getPayInfo(paymentInfo);
			if (!paymentInfos.isEmpty()) {
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
				com.github.pagehelper.PageInfo<TPaymentInfo> pageInfo = new com.github.pagehelper.PageInfo<>(paymentInfos);
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

  

	@PostMapping(value = "/getPayDetailed")
	@ApiOperation(value = "根据收付款id获取收付款详情", notes = "根据收付款id获取收付款详情")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "paymentInfoId", value = "收付款id", required = true, dataType = "String") })
	public ResultObj getTSaleInfoDetail(@RequestParam("paymentInfoId") String paymentInfoId) {
		ResultObj resultObj = new ResultObj();
		List<TPaymentItem> paymentItem = payInfoService.getPayDetailedById(paymentInfoId);
		if (!paymentItem.isEmpty()) {
			resultObj.setCode(DICT.SUCCESS[0]);
			resultObj.setCodeMsg(DICT.SUCCESS[1]);
			resultObj.setData(paymentItem);
			return resultObj;
		}
		resultObj.setCode(DICT.ERROR[0]);
		resultObj.setCodeMsg(DICT.ERROR[1]);
		return resultObj;
	}
    
	@PostMapping(value = "/updateStatus")
   	@ApiOperation(value = "根据id更改审核状态", notes = "根据id更改审核状态")
    @ApiImplicitParams({
		@ApiImplicitParam(name = "paymentInfoId", value = "收付款id", required = true, dataType = "String"),
		@ApiImplicitParam(name = "status", value = "当前审核状态", required = true, dataType = "String")})
   	public ResultObj<?> updateStatus(@RequestParam("paymentInfoId") String paymentInfoId,@RequestParam("status") String status) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			payInfoService.updateStatus(paymentInfoId,status);
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

	@PostMapping(value = "/addPaymentInfo")
	@ApiOperation(value = "新增收付款信息", notes = "新增收付款信息")
	public ResultObj<?> addPaymentInfo(@RequestBody TPaymentInfo paymentInfo) {
		ResultObj resultObj = new ResultObj();
		try {
			paymentInfo.setPaymentInfoId(UuidUtil.getUuid());
			payInfoService.insertPaymentInfo(paymentInfo);
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

    
   
    

   	@PostMapping(value = "/updatePaymentInfo")
   	@ApiOperation(value = "根据id修改收付款信息", notes = "根据id修改收付款信息")
   	public ResultObj<?> updatePaymentInfo(@RequestBody TPaymentInfo paymentInfo) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			payInfoService.updatePaymentInfo(paymentInfo);
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

    
   	@PostMapping(value = "/deletePaymentInfo")
   	@ApiOperation(value = "根据id删除收付款信息", notes = "根据id删除收付款信息")
    @ApiImplicitParams({
		@ApiImplicitParam(name = "paymentInfoId", value = "收付款id", required = true, dataType = "String") })
   	public ResultObj<?> deletePaymentInfo(@RequestParam("paymentInfoId") String paymentInfoId) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			payInfoService.deletePaymentInfo(paymentInfoId);;
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
    
    
	@PostMapping(value = "/addPaymentItem")
	@ApiOperation(value = "新增收付款详情", notes = "新增收付款详情")
	public ResultObj<?> addPaymentItem(@RequestBody TPaymentItem paymentItem) {
		ResultObj resultObj = new ResultObj();
		try {
			paymentItem.setPaymentItemId(UuidUtil.getUuid());
			payInfoService.insertPaymentItem(paymentItem);
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

    
   
    
    
   	@PostMapping(value = "/updatePaymentItem")
   	@ApiOperation(value = "根据id修改收付款详情", notes = "根据id修改收付款详情")
   	public ResultObj<?> updatePaymentItem(@RequestBody TPaymentItem paymentItem) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			payInfoService.updatePaymentItem(paymentItem);
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

    
   	@PostMapping(value = "/deletePaymentItem")
   	@ApiOperation(value = "根据id删除收付款详情", notes = "根据id删除收付款详情")
    @ApiImplicitParams({
		@ApiImplicitParam(name = "paymentItemId", value = "收付款id", required = true, dataType = "String") })
   	public ResultObj<?> deletePaymentItem(@RequestBody String paymentItemId) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			payInfoService.deletePaymentItem(paymentItemId);
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
