package com.xt.lib.api.model.book;

import com.xt.lib.api.model.BaseDTO;
import lombok.Data;

import java.io.Serializable;
@Data
public class BookClassDTO extends BaseDTO implements Serializable {
    /**
     * 书籍分类名称
     */
    private String name;

}
