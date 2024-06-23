package Demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
// import java.sql.Connection;
// import java.sql.Statement;

/**
 * Servlet implementation class Thanks
 */
public class Thanks extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thanks() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String name=request.getParameter("name");
        String pnumber=request.getParameter("pnumber");
        String email=request.getParameter("email");
        String comment=request.getParameter("comment");
        // MyDb con=new MyDb();
        // Connection c=((MyDb) con).getCon();
        
        try {
            // Statement stm=(Statement) c.createStatement();

            // stm.execute("insert into contact(name,pnumber,email,comment)values('"+name+"','"+pnumber+"','"+email+"','"+comment+"')");
            response.sendRedirect("thanks.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
