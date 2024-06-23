package Demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

/**
 * Servlet implementation class Password
 */
public class Password extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Password() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       
        String voter_card_number = request.getParameter("voter_card_number");
       
        // MyDb db = new MyDb();
        // Connection con = db.getCon();
        // System.out.println("hi aseesh");
        
        try {
            // Statement stmt = con.createStatement();
            
            // ResultSet rs1= stmt.executeQuery("select voter_card_number from temp_voter_card_number where voter_card_number = '"+voter_card_number+"'");
            // if(rs1.next())
            // {
            //   response.sendRedirect("votercheck.jsp?name="+voter_card_number);
            // out.println("You already voted........"+rs1.getString("voter_card_number"));
            // System.out.println(voter_card_number);
            // }else
            // {
            
            // ResultSet rs =   stmt.executeQuery("select uid,contact from voter_register where voter_card_number = '"+voter_card_number+"'");
            // if(rs.next()){
            //     String contact = rs.getString("contact");
            //     response.sendRedirect("password.jsp?con="+contact);
            //     out.println(contact);
            //     System.out.println(contact);
            // }else{
            //     out.println("Please enter valid card number");
            // }
            // }
        } catch (Exception ex) {
           
        }
    }

}
