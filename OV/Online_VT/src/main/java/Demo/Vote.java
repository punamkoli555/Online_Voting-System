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
 * Servlet implementation class Vote
 */
public class Vote extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vote() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        String voter_card_number = request.getParameter("voter_card_number");
        String parties = request.getParameter("parties");
        PrintWriter out = response.getWriter();

        // MyDb db = new MyDb();
        // Connection con = db.getCon();
        try {
            // Statement stmt = con.createStatement();

            // stmt.executeUpdate("insert into temp_voter_card_number(voter_card_number)values('"+voter_card_number+"')");
            // stmt.executeUpdate("insert into vote(voter_card_number,partie)values ('"+voter_card_number+"','"+parties+"')");

            response.sendRedirect("index.jsp");

        } catch (Exception ex) {
        }
    }

}
