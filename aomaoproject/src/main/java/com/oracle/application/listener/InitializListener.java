package com.oracle.application.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Slf4j  //日志  ==lombok
public class InitializListener implements ServletContextListener {
    //初始化实现
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("项目启动,进行资源初始化................");

        ServletContext sc = sce.getServletContext();
        sc.setAttribute("root",sc.getContextPath());   //aomao
        sc.setAttribute("css",sc.getContextPath()+"/resources/css");
        sc.setAttribute("js",sc.getContextPath()+"/resources/js");
        sc.setAttribute("images",sc.getContextPath()+"/resources/images");

        log.info("项目启动,资源初始化完毕");
    }
}
