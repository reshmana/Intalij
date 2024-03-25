package com.xworkz.archies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="tomatoServlet",urlPatterns ="/tomato",loadOnStartup = 6)
public class TomatoServlet extends HttpServlet {
    public TomatoServlet(){
        System.out.println("Running no arg Const in TomatoServlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Runnning service in TomatoServlet");

        String  srt= req.getHeader(getServletInfo());

        resp.setContentType("Text/Plain");
        PrintWriter writer= resp.getWriter();
        writer.println("Hello i'm Tomato");

    }
}
