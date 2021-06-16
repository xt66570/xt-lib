package com.xt.lib.api.model.book;

import com.xt.lib.api.model.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class BookDTO extends BaseDTO {

    private String bookName;
    /**
     * 书籍类别
     */
    private int bookClassId;
    private BigDecimal bookPrice;
    private String bookPublish;
    private String bookAuthor;
    /**
     * 书籍图片，多个之间通过分号 隔开
     */
    private String bookImg;
    /**
     * 出版日期
     */
    private Date publishDate;


}
