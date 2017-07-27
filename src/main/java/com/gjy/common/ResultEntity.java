package com.gjy.common;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:ResultEntity
 *
 * @author ty
 * @description 统一返回对象
 * @create 2017/7/13 9:42
 **/
@Data
public class ResultEntity<T> implements Serializable {

    private String code;

    private String msg;

    private Integer success;

    private T datas;

}