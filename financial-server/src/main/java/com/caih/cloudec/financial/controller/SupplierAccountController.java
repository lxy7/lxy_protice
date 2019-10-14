package com.caih.cloudec.financial.controller;


import com.caih.cloudec.common.DICT;
import com.caih.cloudec.common.Result;
import com.caih.cloudec.common.bean.ResultObj;
import com.caih.cloudec.common.utils.UuidUtil;
import com.caih.cloudec.financial.bean.po.TPaymentInfo;
import com.caih.cloudec.financial.bean.po.TSupplierAccount;
import com.caih.cloudec.financial.service.SupplierAccountService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@Slf4j
@Validated
@Api(value="/clouded/financial/supplierAccount",tags="SupplierAccountController",description="供应商账户信息")
@RestController
@RequestMapping("/clouded/financial/supplierAccount")
public class SupplierAccountController {

    @Autowired
    private SupplierAccountService supplierAccountService;

    
   	@PostMapping(value = "/addSupplierAccount")
   	@ApiOperation(value = "新增银行账户信息", notes = "新增银行账户信息")
   	public ResultObj<?> addSupplierAccount(@RequestBody TSupplierAccount supplierAccount) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			supplierAccount.setSupplierAccountId(UuidUtil.getUuid());
   			supplierAccountService.insertSupplierAccount(supplierAccount);
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


    
   	@PostMapping(value = "/updateSupplierAccount")
   	@ApiOperation(value = "新增银行账户信息", notes = "新增银行账户信息")
   	public ResultObj<?> updateSupplierAccount(@RequestBody TSupplierAccount supplierAccount) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			supplierAccountService.updateSupplierAccount(supplierAccount);
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

    
   	@PostMapping(value = "/deleteSupplierAccount")
   	@ApiOperation(value = "根据id删除银行账户信息", notes = "根据id删除银行账户信息")
    @ApiImplicitParams({
		@ApiImplicitParam(name = "supplierAccountId", value = "账户id", required = true, dataType = "String") })
   	public ResultObj<?> deleteSupplierAccount(@RequestParam("supplierAccountId") String supplierAccountId) {
   		ResultObj resultObj = new ResultObj();
   		try {
   			supplierAccountService.deleteSupplierAccount(supplierAccountId);
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
