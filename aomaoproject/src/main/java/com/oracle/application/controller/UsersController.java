package com.oracle.application.controller;


import com.oracle.application.entity.Users;
import com.oracle.application.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;

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
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService iUsersService;

    @RequestMapping("/login")
    public String login(Users users, HttpSession session, Model model){
        //登录需要对数据库进行交互操作 才能认证身份是否合法化
        if(this.iUsersService.login(users)){
            //转发 服务器行为1次请求  重定向客服端行为2次请求
            //会话作用域存放数据
            session.setAttribute("userInfo",users);
            return "redirect:/home";

        }
        //请求作业域存放了一个数据
        model.addAttribute("loginError","用户名不存在或密码错误");
        return "login";
    }

}
