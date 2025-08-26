package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.updateRecordDao;
import daoImpl.UpdateRecordDaoImpl;
import model.Car;

@WebServlet("/fetchRecordServlet")
public class fetchRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public fetchRecordServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int engineNumber = Integer.parseInt(request.getParameter("c_engineNumber"));
		updateRecordDao update = new UpdateRecordDaoImpl();
		Car car = update.getCarByEngineNumber(engineNumber);
		
		if(car != null) {
			request.setAttribute("car", car);
			RequestDispatcher rd = request.getRequestDispatcher("updateRecordForm.jsp");
			rd.forward(request,response);
		}
		else {
			response.getWriter().println("Record not found engine Number : " + engineNumber);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
