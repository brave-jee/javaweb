package com.oracle.application.service;

import com.oracle.application.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
public interface ICartService extends IService<Cart> {

    public List<Cart> findCurrentCart(Integer userId);

}
