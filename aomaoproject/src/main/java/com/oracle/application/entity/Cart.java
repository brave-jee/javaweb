package com.oracle.application.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer cartId;

    private Integer goodsId;

    private Integer num;

    private BigDecimal price;

    private String goodsName;

    private String goodsImg;

    private Integer userId;


}
