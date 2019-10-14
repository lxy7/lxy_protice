package com.caih.cloudec.common.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 操作结果集
 */
@ApiModel("传输公共对象类，规范前后端交互JSON格式")
public class ResultObj<T> implements Serializable {

    private static final long serialVersionUID = -6301996062245964305L;

    /**返回码：0000表示成功**/
    @ApiModelProperty(value = "返回码：0000表示成功")
    private String code;

    /**业务返回码说明*/
    @ApiModelProperty(value = "返回码描述：success")
    private String codeMsg;


    /**
     * 如果是单独查询 单个对象Object，list 可以放这里<br>
     * 如果是分页查询，数据都存入到page里面,dataList也存入page
     */
    /**返回的数据，统一配置到这个字段*/
    @ApiModelProperty(value = "返回的数据 如单个对象则是单个Object，如是数组则是List<Object>")
    private T data;


    /**
     * page经过优化，把属于分页的数据dataList放到page里面
     */
    /**分页信息*/
    @ApiModelProperty(value = "分页信息")
    private Page<T> page;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page<T> getPage() {
        return page;
    }

    public void setPage(Page<T> page) {
        this.page = page;
    }
}
