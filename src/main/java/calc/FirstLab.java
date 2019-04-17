package calc;

import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstLab extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        double num1=(request.getParameter("num1").isEmpty())?0:Double.valueOf( request.getParameter("num1"));
        double num2=(request.getParameter("num2").isEmpty())?0:Double.valueOf( request.getParameter("num2"));
        double num3=(request.getParameter("num3").isEmpty())?0:Double.valueOf( request.getParameter("num3"));
        double num4=(request.getParameter("num4").isEmpty())?0:Double.valueOf( request.getParameter("num4"));

        PrintWriter print=response.getWriter();

        if(num1 >0 && num2 >0){
            print.println(num1 +" + "+num2+" = "+(num1+num2));
        }
        if(num3 >0 && num4 >0){
            print.println(num4 +" * "+num4+" = "+(num3*num4));
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
