package com.wangshao.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author liutao
 * @create 2020-02-23-21:31
 * 监听项目的启动和停止
 */


public class UserListener implements ServletContextListener {

    /**
     * 监听servletContext启动初始化
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("UserListener.........contextInitialized");
    }

    /**
     * 监听servletcontext停止
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("UserListener.........contextDestroyed");
    }
}
