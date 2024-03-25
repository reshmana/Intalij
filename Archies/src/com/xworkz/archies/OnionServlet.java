package com.xworkz.archies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="onionServlet",urlPatterns ="/onion",loadOnStartup = 2)
public class OnionServlet extends HttpServlet {

    public OnionServlet(){
        System.out.println("Running no Arg Const in OnionServlet.....");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        System.out.println("Running service in OnionServlet.....");

        String  srt= req.getHeader(getServletInfo());

        resp.setContentType("Text/Plain");
        PrintWriter writer= resp.getWriter();
        writer.println("Hello i'm Onion");

    }
}
