package Demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.ResultSet;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String admin_name = request.getParameter("admin_name");
        String admin_pass = request.getParameter("admin_pass");

        // MyDb db=new MyDb();
        // Connection con=db.getCon();
        try {
            // Statement stmt=con.createStatement();
            // ResultSet rs=stmt.executeQuery("select * from admin_login where user_name = '"+admin_name+"' and password = '"+admin_pass+"'");
            // if(rs.next())
            // {
            if ("admin".equals(admin_name) && "admin123".equals(admin_pass)) {
                HttpSession session = request.getSession();
                session.setAttribute("adminname", admin_name);
                response.sendRedirect("adminwelcome.jsp");
            } else {
                response.sendRedirect("wrong.jsp");
            }
            // }
            // else
            // {
            // response.sendRedirect("Wrong.jsp");
            // }
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }

}
