package com.caih.cloudec.financial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.caih.cloudec.common.DICT;
import com.caih.cloudec.common.bean.Page;
import com.caih.cloudec.common.bean.ResultObj;
import com.caih.cloudec.common.utils.UuidUtil;
import com.caih.cloudec.financial.bean.po.TInvoiceInfo;
import com.caih.cloudec.financial.bean.po.TInvoiceItem;
import com.caih.cloudec.financial.bean.vo.TInvoiceInfoQueryVo;
import com.caih.cloudec.financial.service.InvoiceInfoService;
import com.github.pagehelper.PageHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
import java.util.List;

@Slf4j
@Validated
@Api(value = "/clouded/financial/invioceInfo", tags = "invioceInfoController", description = "开票信息")
@RestController
@RequestMapping("/clouded/financial/invioceInfo")
public class InvoiceInfoController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private InvoiceInfoService invoiceInfoService;

	
	@PostMapping(value = "/getInvioceInfo")
	@ApiOperation(value = "开票信息列表查询-用于前端列表页", notes = "开票信息列表查询-用于前端列表页")
	/*
	 * @ApiImplicitParams({
	 * 
	 * @ApiImplicitParam(name = "invoiceInfo", value = "开票信息对象", required =
	 * true, dataType = "TInvoiceInfo") })
	 */
	public ResultObj<?> getInvoiceInfo(@RequestBody TInvoiceInfoQueryVo invoiceInfoQueryVo,
			@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize) {
		logger.info("请求参数：【" + invoiceInfoQueryVo + "】");
		Page page = new Page();
		ResultObj resultObj = new ResultObj();
		TInvoiceInfo invoiceInfo = new TInvoiceInfo();
		try {
			BeanUtils.copyProperties(invoiceInfoQueryVo, invoiceInfo);
			PageHelper.startPage(pageNo, pageSize, true);
			List<TInvoiceInfo> invoiceInfos = invoiceInfoService.getInvoiceInfo(invoiceInfo);
			if (invoiceInfos.isEmpty()) {
				resultObj.setCode(DICT.SUCCESS[0]);
				resultObj.setCodeMsg(DICT.SUCCESS[1]);
				com.github.pagehelper.PageInfo<TInvoiceInfo> pageInfo = new com.github.pagehelper.PageInfo<>(
						invoiceInfos);
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

	
	@PostMapping(value = "/add")
	@ApiOperation(value = "新增开票信息", notes = "新增开票信息")
	public ResultObj<?> addInvoiceInfo(@RequestBody TInvoiceInfo invoiceInfo) {
		ResultObj resultObj = new ResultObj();
		try {
			invoiceInfo.setInvoiceInfoId(UuidUtil.getUuid());
			invoiceInfoService.insertInvoiceInfo(invoiceInfo);
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

	
	@PostMapping(value = "/update")
	@ApiOperation(value = "修改开票信息", notes = "修改开票信息")
	public ResultObj<?> updateInvoiceInfo(@RequestBody TInvoiceInfo invoiceInfo) {
		ResultObj resultObj = new ResultObj();
		try {
			invoiceInfoService.updateInvoiceInfo(invoiceInfo);
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

	
	@PostMapping(value = "/getInvioceItem")
	@ApiOperation(value = "根据开票信息id获取开票详情", notes = "根据开票信息id获取开票详情")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "invoiceInfoId", value = "开票信息id", required = true, dataType = "String") })
	public ResultObj getTSaleInfoDetail(@RequestParam("invoiceInfoId") String invoiceInfoId) {
		ResultObj resultObj = new ResultObj();
		List<TInvoiceItem> invoiceitem = invoiceInfoService.getInvoiceDetailedById(invoiceInfoId);
		if (invoiceitem.isEmpty()) {
			resultObj.setCode(DICT.SUCCESS[0]);
			resultObj.setCodeMsg(DICT.SUCCESS[1]);
			resultObj.setData(invoiceitem);
			return resultObj;
		}
		resultObj.setCode(DICT.ERROR[0]);
		resultObj.setCodeMsg(DICT.ERROR[1]);
		return resultObj;
	}

	
	@PostMapping(value = "/addDetailed")
	@ApiOperation(value = "新增开票详情", notes = "新增开票详情")
	public ResultObj<?> addInvoiceItem(@RequestBody TInvoiceItem invoiceItem) {
		ResultObj resultObj = new ResultObj();
		try {
			invoiceItem.setInvoiceItemId(UuidUtil.getUuid());
			invoiceInfoService.insertInvoiceItem(invoiceItem);
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

	
	@PostMapping(value = "/updateDetailed")
	@ApiOperation(value = "修改开票详情", notes = "修改开票详情")
	public ResultObj<?> updateInvoiceInfo(@RequestBody TInvoiceItem invoiceItem) {
		ResultObj resultObj = new ResultObj();
		try {
			invoiceInfoService.updateInvoiceItem(invoiceItem);
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
