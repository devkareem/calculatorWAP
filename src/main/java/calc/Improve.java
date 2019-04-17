package calc;

import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/improve")
public class Improve extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        double num1=(request.getParameter("num1").isEmpty())?0:Double.valueOf( request.getParameter("num1"));
        double num2=(request.getParameter("num2").isEmpty())?0:Double.valueOf( request.getParameter("num2"));
        double num3=(request.getParameter("num3").isEmpty())?0:Double.valueOf( request.getParameter("num3"));
        double num4=(request.getParameter("num4").isEmpty())?0:Double.valueOf( request.getParameter("num4"));
        response.setContentType("text/html");
        PrintWriter print=response.getWriter();

        print.println("<form action=\"improve\" method=\"post\">");
        if(num1 >0 && num2 >0){
            print.println("<input type=\"number\" name=\"num1\" value="+num1+" > + ");
            print.print(" <input type=\"number\" name=\"num2\" value="+num2+"> = ");
            print.print("<input type=\"number\" readonly value="+(num1+num2)+"> <br/>");

        }
        else {
            print.println("<input type=\"number\" name=\"num1\"  /> + ");
            print.print(" <input type=\"number\" name=\"num2\" /> = ");
            print.print("<input type=\"number\" readonly /><br/>");
        }
        if(num3 >0 && num4 >0){
            print.println("<input type=\"number\" name=\"num3\" value="+num3+" > * ");
            print.print(" <input type=\"number\" name=\"num4\" value="+num4+"> = ");
            print.print("<input type=\"number\" readonly value="+(num3*num4)+"><br/>");

        }
        else {
            print.println("<input type=\"number\" name=\"num3\"  /> * ");
            print.print(" <input type=\"number\" name=\"num4\" /> = ");
            print.print("<input type=\"number\" readonly /><br/>");
        }
        print.println("<input type=\"submit\" value=\"Submit\" /></form>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
