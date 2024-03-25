package com.xworkz.reshma;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/tvRecharge",loadOnStartup = 2)
public class TvCableRechargeServlet extends HttpServlet {
    public TvCableRechargeServlet() {
        System.out.println("Running no arg consrt in TvCableRechargeServlet");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("running service in TvCableRechargeServlet");
        String customer = request.getParameter("customer");
        String vendor = request.getParameter("vendor");
        String amount = request.getParameter("amount");
        String rechargeType = request.getParameter("rechargeType");
        String accept=request.getParameter("accept");
        System.out.println(customer+" "+vendor+" "+amount+" "+rechargeType+" "+accept);

        Double ConvAmount=Double.parseDouble(amount);
        System.out.println(ConvAmount);

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
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
        writer.write("<li class=\"nav-item\">");
        writer.write("< <a class=\"nav-link text-white\" href=\"./TvRecharge.html\">TV Cable Recharge</a>");
        writer.write("</li>");
        writer.write("</ul>");
        writer.write("</div>");
        writer.write("</nav>");
        writer.write(" <div class=\"container\">\n");
        writer.write("<h2 class=\"text-warning\">Tv Recharge Plan</h2>"+ConvAmount);
        writer.write("</div>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
