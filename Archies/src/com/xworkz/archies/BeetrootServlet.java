package com.xworkz.archies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="beetrootServlet",urlPatterns ="/beetroot",loadOnStartup = 3)
public class BeetrootServlet extends HttpServlet {

    public BeetrootServlet(){
        System.out.println("Running no arg-constructor in BeetrootServlet.....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running service in BeetrootServlet....");

       String  srt= req.getHeader(getServletInfo());

        resp.setContentType("Text/Plain");
       PrintWriter writer= resp.getWriter();
        writer.println("Hello i'm Beetroot");


    }
}
