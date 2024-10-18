package com.oracle.application.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.oracle.application.entity.Cart;
import com.oracle.application.mapper.CartMapper;
import com.oracle.application.service.ICartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> findCurrentCart(Integer userId) {
        //empty
        List<Cart> cartList = this.cartMapper.selectList(new LambdaQueryWrapper<>(new Cart()).eq(Cart::getUserId,userId));
        return cartList;
    }
}
