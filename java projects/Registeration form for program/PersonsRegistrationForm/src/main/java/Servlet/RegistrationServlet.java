package Servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.PersonsRegistrationForm.dataBase.DBConnection;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegistrationServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Read parameters
        String idStr = request.getParameter("id");
        int id = (idStr != null && !idStr.trim().isEmpty()) ? Integer.parseInt(idStr) : 0;

        String name = request.getParameter("name"); 
        String email = request.getParameter("email");

        String ageStr = request.getParameter("age");
        int age = (ageStr != null && !ageStr.trim().isEmpty()) ? Integer.parseInt(ageStr) : 0;

        String address = request.getParameter("address");
        String password = request.getParameter("password");

        try {
            Connection con = DBConnection.getDBConnection();

            String sql = "INSERT INTO person (p_id, p_name, p_email, p_age, p_address, p_password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setInt(4, age);
            ps.setString(5, address);
            ps.setString(6, password);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                out.println("<h2 style='color:green;'> Data Inserted Successfully</h2>");
            } else {
                out.println("<h2 style='color:red;'> Failed to Insert Data</h2>");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
