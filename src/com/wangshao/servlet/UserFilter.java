package com.wangshao.servlet;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author liutao
 * @create 2020-02-23-21:27
 */


public class UserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //过滤请求
        System.out.println("userFilter..............doFilter");
        //方形
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
