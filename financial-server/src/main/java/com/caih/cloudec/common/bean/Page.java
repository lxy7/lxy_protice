package com.caih.cloudec.common.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 分页类
 * @param <T>
 */
@ApiModel("分页类")
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 7870138395591608535L;

    @ApiModelProperty(value = "当前所在页")
    private int pageNo;//当前页

    @ApiModelProperty(value = "每页页面大小")
    private int pageSize;

    @ApiModelProperty(value = "总记录数")
    private int totalCount;

    @ApiModelProperty(value = "总页数")
    private int totalPage;

    @ApiModelProperty(value = "起始位置")
    private int start;

    @ApiModelProperty(value = "结束位置")
    private int end;

    @ApiModelProperty(value = "是否首页")
    private boolean ifFirst;

    @ApiModelProperty(value = "是否最后一页")
    private boolean ifLast;

    /**返回的数据，统一配置到这个字段*/
    @ApiModelProperty(value = "分页数据返回的数据List<Object>")
    private List<T> dataList;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isIfFirst() {
        return ifFirst;
    }

    public void setIfFirst(boolean ifFirst) {
        this.ifFirst = ifFirst;
    }

    public boolean isIfLast() {
        return ifLast;
    }

    public void setIfLast(boolean ifLast) {
        this.ifLast = ifLast;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
