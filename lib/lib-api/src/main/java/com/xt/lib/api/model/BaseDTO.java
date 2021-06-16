package com.xt.lib.api.model;

import com.xt.lib.api.enums.ValidFlagEnum;
import lombok.Data;

import java.util.Date;


@Data
public class BaseDTO {
    private int id;

    private String temp1;
    private String temp2;
    private Date createDate;
    private Date updateDate;
    /**
     * 有效性
     */
    private ValidFlagEnum validFlag;
}
