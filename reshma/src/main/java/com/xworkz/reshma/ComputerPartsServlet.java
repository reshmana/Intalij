package com.xworkz.reshma;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/computer",loadOnStartup =1 )
public class ComputerPartsServlet extends HttpServlet {

    public ComputerPartsServlet(){
        System.out.println("Running no arg const in ComputerPartsServlet");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        System.out.println("running service in ComputerPartsServlet");
        String brand=request.getParameter("brand");
        String model=request.getParameter("model");
        String color=request.getParameter("color");
        String type=request.getParameter("type");
        String ram=request.getParameter("ram");
        String hardDisk=request.getParameter("hard_disk");
        String processor=request.getParameter("processor");
        String motherBoard=request.getParameter("motherboard");
        String cache=request.getParameter("cache_size");
        String cost=request.getParameter("cost");
        String quantity=request.getParameter("quantity");

        System.out.println(brand+" "+model+" "+color+" "+type+" "+ram+" "+hardDisk+" "+processor+" "+
                motherBoard+" "+cache+" " +cost+" " +quantity);

        Double  conveCost=Double.parseDouble(cost);
        Double convQuantity=Double.parseDouble(quantity);

        Double total=conveCost*convQuantity;
       // System.out.println("totl price" +total);
        System.out.println(brand+" "+model+" "+color+" "+type+" "+ram+" "+hardDisk+" "+processor+" "+
                motherBoard+" "+cache+" " +conveCost+" " +convQuantity);

        PrintWriter writer=response.getWriter();
        response.setContentType("text/html");
        writer.write("<html>");
        writer.write("<head>");
        writer.write(" <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">");
        writer.write("</head>");
        writer.write("<body class=\"p-3 mb-2 bg-secondary text-white>");
        writer.write("nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\"");
        writer.write("<a class=\"navbar-brand\" href=\"./index.html\">Home</a>");
        writer.write("<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
        writer.write("</span>");
        writer.write("</button>");
        writer.write("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">");
        writer.write("<ul class=\"navbar-nav mr-auto\">");
        writer.write("<a class=\"nav-link\" href=\"computerparts.html\">Computer Parts</a>");
        writer.write("</li>");
        writer.write("</ul>");
        writer.write("</div>");
        writer.write("</nav>");
        writer.write(" <div class=\"container\">\n");
        writer.write("<h2 class=\"text-warning\">total cost of computer parts</h2>"+total);
        writer.write("</div>");
        writer.write("</body>");
        writer.write("</html>");



    }
}
