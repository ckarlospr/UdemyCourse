package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // Read parameters from Form1
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println("User = "+user);
        System.out.println("Password = "+password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("user parameter: "+user);
        out.print("<br>");
        out.print("password parameter: "+password);
        out.print("</body>");
        out.print("</html>");
    }
}
