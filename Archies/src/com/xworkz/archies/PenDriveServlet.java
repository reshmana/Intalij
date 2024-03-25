package com.xworkz.archies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="penDriveservlet",urlPatterns ="/pen",loadOnStartup =4)
public class PenDriveServlet extends HttpServlet {


    public PenDriveServlet(){
        System.out.println("running no arg- constructor penDriveservlet....");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servive is created penDriveservlet.....");

        String  srt= request.getHeader(getServletInfo());

        response.setContentType("Text/Plain");
        PrintWriter writer= response.getWriter();
        writer.println("Hello i'm Pendrive");

    }
}
