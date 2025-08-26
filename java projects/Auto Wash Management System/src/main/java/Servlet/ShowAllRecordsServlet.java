package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoImpl.ViewDataDaoImpl;
import model.Car;


@WebServlet("/ShowAllRecordsServlet")
public class ShowAllRecordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ShowAllRecordsServlet() {
        super();
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	
        ViewDataDaoImpl dao = new ViewDataDaoImpl();
        List<Car> cars = dao.getAllCar();

     
        request.setAttribute("cars", cars);

        request.getRequestDispatcher("showResords.jsp").forward(request, response);
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
