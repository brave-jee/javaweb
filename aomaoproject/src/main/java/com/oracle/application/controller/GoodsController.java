package com.oracle.application.controller;


import com.oracle.application.entity.Goods;
import com.oracle.application.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
//@RestController  //将目标类所以请求方法返回结果变成json格式
@Controller  //视图名称 或者是视图和模型数据
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping("/list")
    public String list(Model model){
        //产品数据从何而来
        List<Goods>goodsList = this.iGoodsService.list();
        model.addAttribute("goodsList",goodsList);
        return "list";
    }
    //一个控制层下可以包含多个映射处理方法
}
