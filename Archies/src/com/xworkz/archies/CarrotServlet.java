package com.xworkz.archies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="carrotServlet",urlPatterns ="/carrot",loadOnStartup = 1)
public class CarrotServlet extends HttpServlet {
    public CarrotServlet(){
        System.out.println("Running no arg const in CarrotServlet.....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running service in CarrotServlet");

        String  srt= req.getHeader(getServletInfo());

        resp.setContentType("Text/Plain");
        PrintWriter writer= resp.getWriter();
        writer.println("Hello i'm Carrot");

    }
}
