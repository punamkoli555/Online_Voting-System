package Demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Servlet implementation class MyDb
 */
public class MyDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyDb() {
        super();
        // TODO Auto-generated constructor stub
        Connection con;
        
        public Connection getCon()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", "root");
            } catch (Exception e) {
            } 
            return con;
    }

}
