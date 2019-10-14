package com.caih.cloudec.common.bean;

import io.swagger.annotations.ApiModelProperty;

public class QueryPage {

    @ApiModelProperty(value = "页大小")
    private Integer pageSize;

    @ApiModelProperty(value = "页数")
    private Integer pageNo;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "QueryPage{" +
                "pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
