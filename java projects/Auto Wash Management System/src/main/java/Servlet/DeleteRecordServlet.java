package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoImpl.DeleteRecordDaoImpl;

@WebServlet("/DeleteRecordServlet")
public class DeleteRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public DeleteRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		  try {
		  int engineNumber = Integer.parseInt(request.getParameter("c_engineNumber"));
		  DeleteRecordDaoImpl delete = new DeleteRecordDaoImpl();
				  boolean deleted = delete.deleteRecord(engineNumber);
		  if(deleted) {
			  response.getWriter().println("Record deleted Successfuly.");
		  }else {
		  response.getWriter().println("Record not found.");
		  }
		     } catch (Exception e) {
		            e.printStackTrace();
		            response.getWriter().println("Error: " + e.getMessage());
		        }
		    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	}
