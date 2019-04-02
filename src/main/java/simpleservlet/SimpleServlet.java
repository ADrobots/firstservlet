package simpleservlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       List<String> massages=new ArrayList<String>();
        PrintWriter writer=resp.getWriter();
        Date date=new Date();

        writer.println("<html>");

        writer.println("<head>");
        writer.println("<title>Hello</title>");
        writer.println("</head");

        writer.println("<body>");
        writer.println("<p>Hello world</p>");
        writer.println("<p>"+date.toString()+"</p>");

        for (String message:massages){
            System.out.println("<p>"+message+"</p>");
        }
        writer.println("</body>");

        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message=req.getParameter("massage");

    }
}
