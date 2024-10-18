package com.oracle.application.controller;


import com.oracle.application.entity.Cart;
import com.oracle.application.entity.Users;
import com.oracle.application.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
//@RestController
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    public ICartService iCartService;

    @RequestMapping("myCart")
    public String myCart(HttpSession session, Model model){
        //先验证用户是否处于登录状态  过滤器   拦截器
        Users users = (Users)session.getAttribute("userInfo");
        if(users==null){
            //当用户没有登录时或者是登录已经过期需要跳转到登录页面完成登录
            return "login";
        }
        //根据用户的唯一标识获取当前这个用户的购物车数据信忘

        List<Cart> cartList = this.iCartService.findCurrentCart(users.getUserId());
        model.addAttribute("cartList",cartList);

        return "cart_list";
    }
}
