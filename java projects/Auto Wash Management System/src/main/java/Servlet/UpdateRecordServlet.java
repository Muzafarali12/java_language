package Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.updateRecordDao;
import daoImpl.UpdateRecordDaoImpl;

import model.Car;


@WebServlet("/UpdateRecordServlet")
public class UpdateRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateRecordServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    int engineNumber = Integer.parseInt(request.getParameter("c_engineNumber"));
        String name = request.getParameter("c_name");
        String model = request.getParameter("c_model");
        String color = request.getParameter("c_color");
        String bodyType = request.getParameter("c_bodyType");
        String company = request.getParameter("c_company");

        Car car = new Car();
        car.setCarEngineNumber(engineNumber);
        car.setName(name);
        car.setModel(model);
        car.setColor(color);
        car.setBodyType(bodyType);
        car.setCompany(company);

        updateRecordDao dao = new UpdateRecordDaoImpl();
        boolean updated = dao.updateRecord(car);

        if (updated) {
            response.getWriter().println("Record updated successfully!");
        } else {
            response.getWriter().println("Failed to update record.");
        }
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
