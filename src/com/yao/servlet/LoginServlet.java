package com.yao.servlet;

import com.yao.dao.UserDaoImpl;
import com.yao.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String action = req.getParameter("action");
        UserDaoImpl userDao = new UserDaoImpl();
        switch (action){
            case "login":
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                User user = userDao.checkUser(username, password);
                if(user != null){
                    resp.sendRedirect("goodsList.jsp");
                }
                else if(username == "" && password == ""){
                    req.setAttribute("msg","用户名与密码不能为空");
                    req.getRequestDispatcher("login.jsp").forward(req,resp);
                }
                else if(username == ""){
                    req.setAttribute("msg","用户名不能为空");
                    req.getRequestDispatcher("login.jsp").forward(req,resp);
                }
                else if(password == ""){
                    req.setAttribute("msg","密码不能为空");
                    req.getRequestDispatcher("login.jsp").forward(req,resp);
                }else{
                    req.setAttribute("msg","用户名或密码错误！");
                    req.getRequestDispatcher("login.jsp").forward(req,resp);
                }
                break;
        }
    }
}
