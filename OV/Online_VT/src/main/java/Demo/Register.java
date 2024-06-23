package Demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
// import java.sql.SQLException;
import java.io.PrintWriter;
// import java.sql.Connection;
// import java.sql.Statement;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String voter_card_number = request.getParameter("voter_card_number");
            String address = request.getParameter("address");
            String dob = request.getParameter("dob");
            String contact = request.getParameter("contact");
            String email = request.getParameter("email");
            out.println("Hi Punam Nikam");
            // MyDb db = new MyDb();

            // Connection con = db.getCon();
            // Statement stmt =  con.createStatement();

            // stmt.execute("insert into voter_register(name,surname,voter_card_number,contact,address,dob,email)values('"+name+"','"+surname+"','"+voter_card_number+"','"+contact+"','"+address+"','"+dob+"','"+email+"')");
            // out.println("registration success");
            response.sendRedirect("index.jsp");

        } catch (Exception ex) {
        } 
    }

}
