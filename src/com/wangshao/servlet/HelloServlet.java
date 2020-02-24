package com.wangshao.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liutao
 * @create 2020-02-23-17:23
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println(Thread.currentThread()+"start.............");
        try {
            sayHello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resp.getWriter().write("hello.....");
        System.out.println(Thread.currentThread()+"end.................");
    }

    public void  sayHello() throws InterruptedException {
        System.out.println(Thread.currentThread()+"img......................");
        Thread.sleep(3000);
    }
}
